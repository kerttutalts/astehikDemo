package com.example.dev;

import com.example.dev.model.FormGroup;
import com.example.dev.model.Group;
import com.example.dev.repository.FormGroupRepository;
import com.example.dev.repository.GroupRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final FormGroupRepository formGroupRepository;
	private final GroupRepository groupRepository;

	public Application(FormGroupRepository formGroupRepository, GroupRepository groupRepository) {
		this.formGroupRepository = formGroupRepository;
		this.groupRepository = groupRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		Group group = new Group("Kesksüsteemi juhtimine");
		groupRepository.save(group);
		formGroupRepository.save(new FormGroup("Form 1", group, "Laallala", 3));
	}

}
