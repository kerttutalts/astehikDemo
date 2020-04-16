package com.example.dev;

import com.example.dev.model.FormGroup;
import com.example.dev.repository.FormGroupRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final FormGroupRepository formGroupRepository;

	public Application(FormGroupRepository formGroupRepository) {
		this.formGroupRepository = formGroupRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		Set<FormGroup> forms = Set.of(new FormGroup("Õiguste andmine", "Kesksüsteemi juhtimine", "Kiirabiga seotud vormingud", 3));
		formGroupRepository.saveAll(forms);
	}

}
