package com.pfa.happydog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Builder // simple way to build an object instead of using setters

@AllArgsConstructor //dima tekteb'hom
@NoArgsConstructor

public class Chien {


    @Id
    @SequenceGenerator(
            name = "chien_sequence",
            sequenceName = "chien_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "chien_sequence"
    )
    private Long code;

    @NotBlank(message = "Veuillez renseingner un alias")
    private String alias;

    private int numCage;

    @Column(columnDefinition = "boolean default false")
    private boolean archive = false;

    @Embedded

    @Column(nullable = false)
    private Adresse adresse;

    @OneToOne(mappedBy = "chien", cascade = CascadeType.ALL) // to ensure the bidirectional mapping. It's NOT mandatory.
    private FicheMedicale ficheMedicale;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "chien")
    @JsonBackReference
    private List<Consultation> consultations;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "chien")
    private List<Operation> operations;
}