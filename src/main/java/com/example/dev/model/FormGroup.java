package com.example.dev.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "forms")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FormGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private Group group;

    private String explanation;

    private int formsN;

    public FormGroup(String name, Group group, String explanation, int formsN) {
        this.name = name;
        this.group = group;
        this.explanation = explanation;
        this.formsN = formsN;
    }

}
