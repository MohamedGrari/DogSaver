package com.pfa.happydog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Operation {

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
    @NotNull
    private LocalDate date;

    @Column(nullable = false)
    @NotNull
    private LocalTime heureDebut;

    private LocalTime heureFin;

    @Column(nullable = false)
    @NotNull
    private String type;

    @JsonIgnoreProperties({"numCage", "archive", "adresse", "ficheMedicale"})
    @ManyToOne(optional = false)
    private Chien chien;

    @JsonIgnoreProperties({"email", "numTel", "cin", "genre", "active"})
    @ManyToOne(optional = false)
    private Staff staff;
}