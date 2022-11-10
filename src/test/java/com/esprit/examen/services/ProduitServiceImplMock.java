package com.esprit.examen.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Produit;
import com.esprit.examen.repositories.ProduitRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ProduitServiceImplMock {

    @Mock
    ProduitRepository produitRepository;

    @InjectMocks
    ProduitServiceImpl produitServiceImpl;

    Produit produit = new Produit(null, "haythem", "pc" , 12 ,new Date(), null, null, null, null );
    Produit produit1 = new Produit(null, "raed", "game" , 90 ,new Date(), null, null, null, null );
    Produit produit2 = new Produit(null, "sofienne", "phone" , 15 ,new Date(), null, null, null, null );
    List<Produit> list = new ArrayList<Produit>() {
        {
            add(produit1);
            add(produit2);
        }
    };



    @Test
    void testRetrieveProduit() {
        Mockito.when(produitRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(produit));
        Produit prod1 = produitServiceImpl.retrieveProduit(1L);
        Assertions.assertNotNull(prod1);
    }


    @Test
    void updateProduitTest(){
        produit.setLibelleProduit("Libelle 1 updated");
        Assertions.assertNotNull(produitServiceImpl.updateProduit(produit));
    }
    @Test
    void deleteProduitTest(){
        produitServiceImpl.deleteProduit(
                produit2.getIdProduit());
        Assertions.assertNotNull(list);
    }
}
