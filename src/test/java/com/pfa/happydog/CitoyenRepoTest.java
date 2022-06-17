package com.pfa.happydog;

import com.pfa.happydog.model.Citoyen;
import com.pfa.happydog.repository.CitoyenRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class CitoyenRepoTest {

    @Autowired
    /* bch ynajem yesta3mel l bean laptop instancier par Spring cont ainer */
    private CitoyenRepo citoyenRepo;

    @Test
    public void saveCitoyen(){
        Citoyen citoyen = Citoyen.builder()
                .nom("gr")
                .prenom("manel")
                .email("manelgr@gmail.com")
                .numTel(541201112L).build();
        citoyenRepo.save(citoyen);

    }
}
