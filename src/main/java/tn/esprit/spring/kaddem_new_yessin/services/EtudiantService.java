package tn.esprit.spring.kaddem_new_yessin.services;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.kaddem_new_yessin.repository.ContratRepository;
import tn.esprit.spring.kaddem_new_yessin.repository.DepartementRepository;
import tn.esprit.spring.kaddem_new_yessin.repository.EquipeRepository;
import tn.esprit.spring.kaddem_new_yessin.repository.EtudiantRepository;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
//import tn.esprit.spring.kaddem_new_yessin.repository.*;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class EtudiantService implements InterfaceEtudiantService {

    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;
    ContratRepository  contratRepository;
    EquipeRepository equipeRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }


    @Override
    public void assignEtudiantToDepartement (Long etudiantId, Long departementId) {
        Etudiant e = etudiantRepository.findById(etudiantId).orElse(null);
        Departement d = departementRepository.findById(departementId).orElse(null);
        e.setDepartement(d);
        etudiantRepository.save(e);

    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract (Etudiant e, Long idContrat , Long idEquipe){
        Contrat c = contratRepository.findById(idContrat).orElse(null);
        Equipe eq = equipeRepository.findById(idEquipe).orElse(null);
        c.setEtudiant(e);
        etudiantRepository.save(e);
        eq.getEtudiants().add(e);
        c.setEtudiant(e);
        return e;
    }
}
