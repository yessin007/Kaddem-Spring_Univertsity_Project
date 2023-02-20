
package tn.esprit.spring.kaddem_new_yessin.controllers;

        import lombok.AllArgsConstructor;
        import org.springframework.web.bind.annotation.*;
        import tn.esprit.spring.kaddem_new_yessin.services.*;
        import tn.esprit.spring.kaddem_new_yessin.entities.*;


        import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {


    InterfaceEtudiantService interfaceEtudiantService;

    @GetMapping("/retrive-all-etudiant")
    public List<Etudiant> getEtudiantList() {
        List<Etudiant> listEtudiant = interfaceEtudiantService.retrieveAllEtudiants();
        return listEtudiant;
    }

    @GetMapping("/retrieve-etudiant/{etudiantId}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiantId") Long etudiantId) {
        return interfaceEtudiantService.retrieveEtudiant(etudiantId);
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant (@RequestBody Etudiant e){
        Etudiant etudiant = interfaceEtudiantService.addEtudiant(e);
        return etudiant;
    }

    @DeleteMapping("/delete-etudiant/{etudiantId}")
    public void deleteEtudiant (@PathVariable("etudiantId") Long etudiantId) {
        interfaceEtudiantService.deleteEtudiant(etudiantId);
    }

    @PutMapping("/update-etudiant")
    public Etudiant updateUniversite(@RequestBody Etudiant e){
        Etudiant etudiant = interfaceEtudiantService.updateEtudiant(e);
        return etudiant;
    }

    @PutMapping("/assignEtudiant-Departement/{etudiantId}/{departementId}")
    public void assignEtudiantToDepartement (@PathVariable("etudiantId") Long etudiantId, @PathVariable("departementId") Long
            departementId) {
        interfaceEtudiantService.assignEtudiantToDepartement(etudiantId,departementId);
    }

    @PostMapping("/addAndAssignEtudiantToEquipeAndContract/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,@PathVariable("idContrat") Long idContrat,@PathVariable("idEquipe") Long idEquipe){
        return interfaceEtudiantService.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);
    }
}
