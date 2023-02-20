package tn.esprit.spring.kaddem_new_yessin.services;

import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import tn.esprit.spring.kaddem_new_yessin.entities.*;
import tn.esprit.spring.kaddem_new_yessin.repository.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;
@Service
@Slf4j
@AllArgsConstructor
public class ContratService implements InterfaceContratService{


    ContratRepository contratRepository;
    EtudiantRepository etudiantRepository;

    @Override
    public List<Contrat> retrieveAllcontrats() {

        return contratRepository.findAll();
    }

    @Override
    public Contrat retrieveContrat(Long idContart) {
        return contratRepository.findById(idContart).get();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public void deleteContrat(Long idContrat) {

        contratRepository.deleteById(idContrat);
    }

    @Override
    public Contrat updateContrat(Contrat c) {

        return contratRepository.save(c);
    }

    @Override
    public Contrat affectContratToEtudiant (Contrat ce, String nomE,String prenomE){
        Etudiant e = etudiantRepository.findByNomEAndPrenomE(nomE,prenomE);
        Contrat c = contratRepository.save(ce);
        c.setEtudiant(e);
        etudiantRepository.save(e);
        return c;
    }

    @Override

    public void retrieveAndUpdateStatusContrat(){
        List<Contrat> c = retrieveAllcontrats();


        for (int i=0;i<c.size();i++){
            Long r = c.get(i).getDateFinContrat().getTime()- new Date().getTime();
            log.info("r"+r);
            Long t = r/86400000;
            log.info("t"+t);
            if ( t==0){
                c.get(i).setArchive(true);

                log.info("contrat ta3 sayed walla archivee"  +c.get(i).getEtudiant().getNomE());
            }
           else if (1<=t && t<=15){
                log.info("contrat de l'etudiant "+c.get(i).getEtudiant().getNomE() +"  "+ c.get(i).getEtudiant().getPrenomE()+"  va s'expirer le  " +
                        " "+ c.get(i).getDateFinContrat() );
            }

            else{
                log.info("contrat de l'etudiant "+c.get(i).getEtudiant().getNomE() +"  "+ c.get(i).getEtudiant().getPrenomE()+" mazeelllll  b3iddd");
            }

        }

    }


}
