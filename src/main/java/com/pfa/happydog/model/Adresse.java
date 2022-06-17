package com.pfa.happydog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
/**
 * @Embeddable annotation to declare that a class will be embedded by other model.
 */
@AttributeOverrides(
        {
                @AttributeOverride(name = "codeZip", column = @Column(name = "adresse_code_zip")),
                @AttributeOverride(name = "refGps", column = @Column(name = "adresse_ref_gps")),
                @AttributeOverride(name = "rue", column = @Column(name = "adresse_rue")),
                @AttributeOverride(name = "indication", column = @Column(name = "adresse_indication"))
        }
)
/**
 * @AttributeOverrides and @AttibuteOverride to override the column properties of our embedded type.
 * So they can be mapped properly.
 */
public class Adresse {

    private String rue;

    private String indication;

    private Integer codeZip;

    private String refGps;
}
