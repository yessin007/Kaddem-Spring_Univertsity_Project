package tn.esprit.spring.kaddem_new_yessin.services;
import java.util.List;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
public interface InterfaceEquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe retrieveEquipe(Long equipeId);

    void deleteEquipe(Long equipeId);

    Equipe updateEquipe(Equipe e);
    void faireEvoluerEquipes();
}
