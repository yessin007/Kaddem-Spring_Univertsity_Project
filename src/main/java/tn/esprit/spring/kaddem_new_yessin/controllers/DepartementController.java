package tn.esprit.spring.kaddem_new_yessin.controllers;

        import lombok.AllArgsConstructor;
        import org.springframework.web.bind.annotation.*;
        import tn.esprit.spring.kaddem_new_yessin.services.*;
        import tn.esprit.spring.kaddem_new_yessin.entities.*;


        import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/departement")
public class DepartementController {


    InterfaceDepartementService interfaceDepartementService;

    @GetMapping("/retrive-all-departement")
    public List<Departement> getUniversiteList() {
        List<Departement> listDepartement = interfaceDepartementService.retrieveAllDepartements();
        return listDepartement;
    }

    @GetMapping("/retrieve-departement/{departementId}")
    public Departement retrieveDepartement(@PathVariable("departementId") Long departementId) {
        return interfaceDepartementService.retrieveDepartement(departementId);
    }

    @PostMapping("/add-departement")
    public Departement addDepartement(@RequestBody Departement d){
        Departement departement = interfaceDepartementService.addDepartement(d);
        return departement;
    }

    @DeleteMapping("/delete-departement/{departementId}")
    public void deleteDepartement (@PathVariable("departementId") Long departementId) {
        interfaceDepartementService.deleteDepartement(departementId);
    }

    @PutMapping("/update-departement")
    public Departement updateDepartement(@RequestBody Departement d){
        Departement departement = interfaceDepartementService.updateDepartement(d);
        return departement;
    }


}
