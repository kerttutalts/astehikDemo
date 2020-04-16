package com.example.dev.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "form")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FormGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String gruppName;
    private String explanation;
    private int formsN;

    public FormGroup(String name, String gruppName, String explanation, int formsN) {
        this.name = name;
        this.gruppName = gruppName;
        this.explanation = explanation;
        this.formsN = formsN;
    }

}
