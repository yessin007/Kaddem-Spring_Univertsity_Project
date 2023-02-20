package tn.esprit.spring.kaddem_new_yessin.controllers;

        import lombok.AllArgsConstructor;
        import org.springframework.web.bind.annotation.*;
        import tn.esprit.spring.kaddem_new_yessin.services.*;
        import tn.esprit.spring.kaddem_new_yessin.entities.*;


        import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/detailEquipe")
public class DetailEquipeController {

    InterfaceDetailEquipeService interfaceDetailEquipeService;

    @GetMapping("/retrive-all-detailEquipe")
    public List<DetailEquipe> getDetailEquipeList() {
        List<DetailEquipe> listdetailEquipe = interfaceDetailEquipeService.retrieveAllDetailEquipes();
        return listdetailEquipe;
    }

    @GetMapping("/retrieve-detailEquipe/{detailEquipeId}")
    public DetailEquipe retrieveDetailEquipe(@PathVariable("detailEquipeId") Long detailEquipeId) {
        return interfaceDetailEquipeService.retrieveDetailEquipe(detailEquipeId);
    }

    @PostMapping("/add-detailEquipe")
    public DetailEquipe addUniversite(@RequestBody DetailEquipe d){
        DetailEquipe detailEquipe = interfaceDetailEquipeService.addDetailEquipe(d);
        return detailEquipe;
    }

    @DeleteMapping("/delete-detailEquipe/{detailEquipeId}")
    public void deleteDetailEquipe (@PathVariable("detailEquipeId") Long detailEquipeId) {
        interfaceDetailEquipeService.deleteDetailEquipe(detailEquipeId);
    }

    @PutMapping("/update-detailEquipe")
    public DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe d){
        DetailEquipe detailEquipe = interfaceDetailEquipeService.updateDetailEquipe(d);
        return detailEquipe;
    }

}
