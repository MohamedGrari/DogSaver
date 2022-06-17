package com.pfa.happydog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Reclamation {

    @Id
    @SequenceGenerator(
            name = "reclamation_sequence",
            sequenceName = "reclamation_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reclamation_sequence"
    )
    private Long id;

    @CreatedDate
    private LocalDate dateRecu;

    @Column(columnDefinition = "varchar(255) default 'Non traite'")
    @NotNull
    private String etat;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Citoyen citoyen;

    @JsonIgnoreProperties({"numCage", "archive", "adresse", "ficheMedicale"})
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Chien chien;

}