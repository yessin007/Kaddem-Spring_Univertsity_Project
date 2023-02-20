package tn.esprit.spring.kaddem_new_yessin.services;
import java.util.List;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
public interface InterfaceContratService {
    List<Contrat> retrieveAllcontrats();

    Contrat retrieveContrat(Long idContrat);

    Contrat addContrat(Contrat c);

    void deleteContrat(Long idContrat);

    Contrat updateContrat(Contrat c);

    Contrat affectContratToEtudiant (Contrat ce, String nomE,String prenomE);

    void retrieveAndUpdateStatusContrat();



}
