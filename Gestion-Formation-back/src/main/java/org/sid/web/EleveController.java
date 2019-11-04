package org.sid.web;


import org.sid.dao.EleveRepository;
import org.sid.entities.Eleve;
import org.sid.metier.ApplicationPropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class EleveController {


    @Autowired
    ApplicationPropertiesConfiguration appProperties;

    @Autowired
    EleveRepository eleveRepository;

    @PostMapping("/add-eleve")
    Eleve newEleve(@RequestBody Eleve newEleve) {
        return eleveRepository.save(newEleve);
    }


    @GetMapping("/eleves")
    List<Eleve> getAll() {
        return eleveRepository.findAll();
    }

    @DeleteMapping("/delete-eleve/{id}")
    void deleteEmployee(@PathVariable Long id) {
        eleveRepository.deleteById(id);
    }



    // Affiche la liste de tous les produits disponibles
    @GetMapping(value = "/params")
    public int listeDesProduits(){

        return appProperties.getLimitDeProduits();

    }
}
