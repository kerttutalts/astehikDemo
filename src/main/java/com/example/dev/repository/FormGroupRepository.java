package com.example.dev.repository;

import com.example.dev.model.FormGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormGroupRepository extends JpaRepository<FormGroup, Long> {

}
