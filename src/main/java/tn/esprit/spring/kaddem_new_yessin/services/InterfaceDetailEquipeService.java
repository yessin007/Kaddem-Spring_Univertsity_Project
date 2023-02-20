package tn.esprit.spring.kaddem_new_yessin.services;
import java.util.List;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
public interface InterfaceDetailEquipeService {
    List<DetailEquipe> retrieveAllDetailEquipes();

    DetailEquipe retrieveDetailEquipe(Long detailequipe);

    DetailEquipe addDetailEquipe(DetailEquipe e);

    DetailEquipe updateDetailEquipe(DetailEquipe e);

    void deleteDetailEquipe(Long idDetailEquipe);
}
