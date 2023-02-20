package tn.esprit.spring.kaddem_new_yessin.services;
import java.util.List;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
public interface InterfaceUniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite retrieveUniversite(Long idUniversite);

    Universite addUniversite(Universite u);

    void deleteUniversite(Long idUniversite);

    Universite updateUniversite(Universite u);

    void assignUniversiteToDepartement(Long idUniversite, Long idDepartement);
}
