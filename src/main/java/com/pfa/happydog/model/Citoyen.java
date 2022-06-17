package com.pfa.happydog.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder // make a builder that can see the properties of its ancestors.

public class Citoyen extends Personne {
    @Id
    @SequenceGenerator(
            name = "personne_sequence",
            sequenceName = "personne_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "personne_sequence"
    )
    private Long id;


}