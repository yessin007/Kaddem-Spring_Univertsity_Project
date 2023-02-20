package tn.esprit.spring.kaddem_new_yessin.services;
import java.util.List;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
public interface InterfaceDepartementService {
    List<Departement> retrieveAllDepartements();

    Departement retrieveDepartement(Long idDepartement);

    Departement addDepartement(Departement e);

    void deleteDepartement(Long idDepartement);

    Departement updateDepartement(Departement e);



}
