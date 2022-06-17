package com.pfa.happydog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Staff extends Personne {
    @Id
    @NotBlank
    private String cin;
    private char genre;
    @NotNull
    private String role;
    @Column(columnDefinition = "boolean default true")
    private boolean active = true;


    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "staff")
    @JsonBackReference
    private List<Consultation> consultations;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "staff")
    private List<Operation> operations;
}