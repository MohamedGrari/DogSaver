package com.pfa.happydog;

import com.pfa.happydog.model.Adresse;
import com.pfa.happydog.model.Chien;
import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.repository.FicheMedicaleRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FicheMedicaleRepoTest {
    @Autowired
    private FicheMedicaleRepo repo;

    @Test
    public void saveFicheMedicale() {
        Chien chien = Chien.builder()
                .alias("bob")
                .adresse(new Adresse())
                .numCage(12)
                .build();
        FicheMedicale ficheMedicale = FicheMedicale.builder()
                .couleur("noir")
                .etat("non vaccine")
                .poil("long")
                .race("pure")
                .sexe('M')
                .taille("grand")
                .chien(chien)
                .build();
        repo.save(ficheMedicale);
    }
    @Test
    public void printFicheMedicaleTest(){
        List<FicheMedicale> ficheMedicale = repo.findAll();
        System.out.println("ficheMedicale = " + ficheMedicale);
    }
}
