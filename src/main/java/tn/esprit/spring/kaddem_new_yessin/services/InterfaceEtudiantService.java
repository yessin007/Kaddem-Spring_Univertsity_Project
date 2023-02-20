package tn.esprit.spring.kaddem_new_yessin.services;
import java.util.List;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
public interface InterfaceEtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant retrieveEtudiant(Long idEtudiant);

    Etudiant addEtudiant(Etudiant e);

    void deleteEtudiant(Long idEtudiant);

    Etudiant updateEtudiant(Etudiant e);

    void assignEtudiantToDepartement (Long etudiantId, Long departementId);

    Etudiant addAndAssignEtudiantToEquipeAndContract (Etudiant e, Long idContrat , Long idEquipe);
}
