package com.pfa.happydog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "chien")
public class FicheMedicale {

    @Id
    @SequenceGenerator(
            name = "fiche_sequence",
            sequenceName = "fiche_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fiche_sequence"
    )
    private Long id;

    @NotNull
    private char sexe;

    @NotNull
    private String race;

    private String couleur;

    private String taille;

    private String poil;

    @Column(nullable = false) // Not Null
    @NotNull
    private String etat;

    private String remarque;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false) // We must use
                                                    //@ToString(exclude = "chien")
    /**
     * optional: So you can't persist a FicheMedical instance without a Chien instance
     * (chien_code must be not null)
     */
    /**
     * CascadeType is used so when we persist (or remove) a FicheMedicale instance,
     * a Chien instance is also persisted (or removed) if it's not already persisted.
     */
    /**
     *
     The owning side of the relation tracked by Hibernate is the side of the relation
     that owns the foreign key in the database. FicheMedicale in this case.
     */
    private Chien chien;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "ficheMedicale")
    private List<Traitement> traitements;
}
