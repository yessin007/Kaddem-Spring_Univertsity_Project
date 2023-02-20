package tn.esprit.spring.kaddem_new_yessin.services;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.kaddem_new_yessin.repository.DepartementRepository;
import tn.esprit.spring.kaddem_new_yessin.repository.UniversiteRepository;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
//import tn.esprit.spring.kaddem_new_yessin..*;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UniversiteService implements InterfaceUniversiteService {

    UniversiteRepository universiteRepository;
    DepartementRepository departementRepository;

    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public void assignUniversiteToDepartement(Long idUniversite, Long idDepartement) {
        Universite u = universiteRepository.findById(idUniversite).orElse(null);
        Departement d = departementRepository.findById(idDepartement).orElse(null);
        u.setDepartement(d);
        universiteRepository.save(u);

    }


}

