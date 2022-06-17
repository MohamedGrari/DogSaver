package com.pfa.happydog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Medicament {

    @Id
    @SequenceGenerator(
            name = "medicament_sequence",
            sequenceName = "medicament_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "medicament_sequence"
    )
    private long id;

    @Column(nullable = false)
    @NotBlank
    private String label;

    private String designation;

    private String forme;

}