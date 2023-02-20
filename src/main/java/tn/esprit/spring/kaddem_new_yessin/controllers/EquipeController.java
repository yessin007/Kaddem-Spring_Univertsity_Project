package tn.esprit.spring.kaddem_new_yessin.controllers;

        import lombok.AllArgsConstructor;
        import org.springframework.web.bind.annotation.*;
        import tn.esprit.spring.kaddem_new_yessin.services.*;
        import tn.esprit.spring.kaddem_new_yessin.entities.*;


        import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeController {

    InterfaceEquipeService interfaceEquipeService;


    @GetMapping("/retrive-all-equipe")
    public List<Equipe> getEquipeList() {
        List<Equipe> listEquipe = interfaceEquipeService.retrieveAllEquipes();
        return listEquipe;
    }

    @GetMapping("/retrieve-equipe/{equipeId}")
    public Equipe retrieveEquipe(@PathVariable("equipeId") Long equipeId) {
        return interfaceEquipeService.retrieveEquipe(equipeId);
    }

    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe e){
        Equipe equipe = interfaceEquipeService.addEquipe(e);
        return equipe;
    }

    @DeleteMapping("/delete-equipe/{equipeId}")
    public void deleteEquipe (@PathVariable("equipeId") Long equipeId) {
        interfaceEquipeService.deleteEquipe(equipeId);
    }

    @PutMapping("/update-equipe")
    public Equipe updateEquipe(@RequestBody Equipe e){
        Equipe equipe = interfaceEquipeService.updateEquipe(e);
        return equipe;
    }

}
