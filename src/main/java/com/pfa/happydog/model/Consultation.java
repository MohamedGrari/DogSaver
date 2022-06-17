package com.pfa.happydog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Consultation {
    @Id
    @SequenceGenerator(
            name = "intervention_sequence",
            sequenceName = "intervention_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "intervention_sequence"
    )
    private Long id;

    @Column(nullable = false)
    @NotNull
    private LocalDate date;

    private LocalTime heure;

    @JsonIgnoreProperties({"email", "numTel", "cin", "genre", "active"})
    @ManyToOne(optional = false)
    private Staff staff;

    @JsonIgnoreProperties({"numCage", "archive", "adresse", "ficheMedicale"})
    @ManyToOne(optional = false)
    private Chien chien;

}