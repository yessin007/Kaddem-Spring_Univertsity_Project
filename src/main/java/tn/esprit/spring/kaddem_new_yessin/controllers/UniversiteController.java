package tn.esprit.spring.kaddem_new_yessin.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.kaddem_new_yessin.services.*;
import tn.esprit.spring.kaddem_new_yessin.entities.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    InterfaceUniversiteService interfaceUniversiteService;

    @GetMapping("/retrive-all-universite")
    public List<Universite> getUniversiteList() {
        List<Universite> listUniversite = interfaceUniversiteService.retrieveAllUniversite();
        return listUniversite;
    }

    @GetMapping("/retrieve-universite/{universiteId}")
    public Universite retrieveUniversite(@PathVariable("universiteId") Long universiteIdd) {
        return interfaceUniversiteService.retrieveUniversite(universiteIdd);
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u){
        Universite universite = interfaceUniversiteService.addUniversite(u);
        return universite;
    }

    @DeleteMapping("/delete-universite/{universiteId}")
    public void deleteUniversite (@PathVariable("universiteId") Long universiteId) {
        interfaceUniversiteService.deleteUniversite(universiteId);
    }

    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite u){
        Universite universite = interfaceUniversiteService.updateUniversite(u);
        return universite;
    }

    @PutMapping("/assignUniversiteToDepartement/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable("idUniversite") Long idUniversite, @PathVariable("idDepartement")
    Long idDepartement){

        interfaceUniversiteService.assignUniversiteToDepartement(idUniversite,idDepartement);

    }

}
