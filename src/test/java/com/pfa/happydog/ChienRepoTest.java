package com.pfa.happydog;

import com.pfa.happydog.model.Adresse;
import com.pfa.happydog.model.Chien;
import com.pfa.happydog.model.FicheMedicale;
import com.pfa.happydog.repository.ChienRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ChienRepoTest {
    @Autowired
    private ChienRepo chienRepo;

    @Test
    public void saveChien(){
        Adresse adresse = new Adresse("Beya Ayari",null,5422,null );
        FicheMedicale ficheMedicale = FicheMedicale.builder()
                .couleur("noir")
                .etat("vaccine")
                .poil("long")
                .race("croise")
                .sexe('M')
                .taille("grand")
                .build();
        Chien chien = Chien.builder()
                .alias("bob")
                .archive(false)
                .adresse(adresse)
                .ficheMedicale(ficheMedicale)
                .numCage(1)
                .build();

        chienRepo.save(chien);

        Adresse adresse1 = new Adresse("Beya 5","hjsfbsad",5422,null );
        FicheMedicale ficheMedicale1 = FicheMedicale.builder()
                .couleur("blanc")
                .etat("vaccine")
                .poil("long")
                .race("croise")
                .sexe('F')
                .taille("moyen")
                .build();
        Chien chien1 = Chien.builder()
                .alias("fox")
                .archive(false)
                .adresse(adresse1)
                .ficheMedicale(ficheMedicale1)
                .numCage(2)
                .build();

        chienRepo.save(chien1);

    }

    @Test
    public void getChienById(){
        Optional<Chien> chien = chienRepo.findById(1L);
        System.out.println("chien = " + chien);
    }

    @Test
    public void getChienByCodeTest(){
        Chien listChien = chienRepo.findChienByAlias("fox");
        System.out.println("listChien = " + listChien);
    }

    @Test
    public void sumCodeZip(){
        Long somme = chienRepo.sumCodeZipByCode(2L);
        System.out.println("somme = " + somme);
    }

    @Test
    public void sumCodeZipNative(){
        Long somme = chienRepo.sumCodeZipByCodeNative(2L);
        System.out.println("somme = " + somme);
    }

    @Test
    public void sumCodeZipNamedParam(){
        Long somme = chienRepo.sumCodeZipByCodeNativeNamedParam(2L);
        System.out.println("somme = " + somme);
    }

    @Test
    public void updateCouleurByIdTest(){
         chienRepo.updateCouleurById("marron",3L);
    }
    @Test
    public void printAllChien(){
        List<Chien> chiens = chienRepo.findAll();
        System.out.println("chiens = " + chiens);
    }
}
