package com.example.dev.controller;


import com.example.dev.model.FormGroup;
import com.example.dev.repository.FormGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class FormGroupController {

    private final FormGroupRepository formGroupRepository;

    public FormGroupController(FormGroupRepository formGroupRepository) {
        this.formGroupRepository = formGroupRepository;
    }

    @GetMapping("/forms")
    Collection<FormGroup> forms() {
        return formGroupRepository.findAll();
    }

    @GetMapping("/forms/{id}")
    ResponseEntity<?> getForm(@PathVariable Long id) {
        Optional<FormGroup> expense = formGroupRepository.findById(id);

        return expense.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @PostMapping("/forms")
    ResponseEntity<FormGroup> createForm(@Valid @RequestBody FormGroup form) throws URISyntaxException {
        FormGroup result = formGroupRepository.save(form);

        return ResponseEntity.created(new URI("/api/v1/forms" + result.getId())).body(result);
    }

    @PutMapping("/forms/{id}")
    ResponseEntity<FormGroup> updateForm(@Valid @RequestBody FormGroup form) {
        FormGroup result = formGroupRepository.save(form);

        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/forms/{id}")
    ResponseEntity<?> deleteFOrm(@PathVariable Long id) {
        formGroupRepository.deleteById(id);

        return ResponseEntity.ok().build();
    }

}
