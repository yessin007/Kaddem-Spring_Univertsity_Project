package tn.esprit.spring.kaddem_new_yessin.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.kaddem_new_yessin.repository.DepartementRepository;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
import tn.esprit.spring.kaddem_new_yessin.repository.EtudiantRepository;
import tn.esprit.spring.kaddem_new_yessin.repository.UniversiteRepository;
//import tn.esprit.spring.kaddem_new_yessin.repository.*;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class DepartementService implements InterfaceDepartementService  {

    DepartementRepository departementRepository;
    EtudiantRepository etudiantRepository;
    UniversiteRepository universiteRepository;

    @Override
    public List<Departement> retrieveAllDepartements() {

        return departementRepository.findAll();
    }

    @Override
    public Departement retrieveDepartement(Long idDepartement) {
        return departementRepository.findById(idDepartement).get();
    }

    @Override
    public Departement addDepartement(Departement e) {
        return departementRepository.save(e);
    }

    @Override
    public void deleteDepartement(Long idDepartement) {

        departementRepository.deleteById(idDepartement);
    }

    @Override
    public Departement updateDepartement(Departement e) {

        return departementRepository.save(e);
    }


}
