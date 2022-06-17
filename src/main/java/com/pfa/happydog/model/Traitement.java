package com.pfa.happydog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Traitement {

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
    private Date dateDebut;

    @NotNull
    private Date dateFin;

    @NotNull
    private int qte; // par ml ou par pilule

    @NotNull
    private int frequence; //par jour

    @JsonIgnoreProperties({"couleur", "taille", "poil", "remarque"})
    @ManyToOne(optional = false)
    private FicheMedicale ficheMedicale;

    @ManyToOne(optional = false)
    private Medicament medicament;

    @JsonIgnoreProperties({"email", "numTel", "cin", "genre", "active"})
    @ManyToOne(optional = false)
    private Staff veto;

    @JsonIgnoreProperties({"email", "numTel", "cin", "genre", "active"})
    @ManyToOne(optional = false)
    private Staff infirmier;
}