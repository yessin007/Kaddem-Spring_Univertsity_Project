package tn.esprit.spring.kaddem_new_yessin.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.kaddem_new_yessin.services.*;
import tn.esprit.spring.kaddem_new_yessin.entities.*;


import java.util.List;

    @RestController
    @AllArgsConstructor
    @RequestMapping("/contrat")
    public class ContratController {


        InterfaceContratService interfaceContratService;

        @GetMapping("/retrive-all-contrat")
        public List<Contrat> getContratList() {
            List<Contrat> listContrat = interfaceContratService.retrieveAllcontrats();
            return listContrat;
        }

        @GetMapping("/retrieve-contrat/{contratId}")
        public Contrat retrieveContrat(@PathVariable("contratId") Long contratId) {
            return interfaceContratService.retrieveContrat(contratId);
        }

        @PostMapping("/add-contrat")
        public Contrat addContrat(@RequestBody Contrat c){
            Contrat contrat = interfaceContratService.addContrat(c);
            return contrat;
        }

        @DeleteMapping("/delete-contrat/{contratId}")
        public void deleteContrat (@PathVariable("contratId") Long contratId) {
            interfaceContratService.deleteContrat(contratId);
        }

        @PutMapping("/update-contrat")
        public Contrat updateContrat(@RequestBody Contrat c){
            Contrat contrat = interfaceContratService.updateContrat(c);
            return contrat;
        }

        @PostMapping("/affectContratToEtudiant/{nomE}/{prenomE}")
        public Contrat affectContratToEtudiant(@RequestBody Contrat ce,@PathVariable("nomE") String nomE, @PathVariable("prenomE") String prenomE){
           return interfaceContratService.affectContratToEtudiant(ce,nomE,prenomE);
        }

    }


