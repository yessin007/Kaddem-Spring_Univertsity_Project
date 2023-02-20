package tn.esprit.spring.kaddem_new_yessin.services;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.spring.kaddem_new_yessin.repository.EquipeRepository;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
//import tn.esprit.spring.kaddem_new_yessin.repository.*;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class EquipeService implements InterfaceEquipeService {

    EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {

        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {

        return equipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Long idEquipe) {

        return equipeRepository.findById(idEquipe).get();
    }

    @Override
    public void deleteEquipe(Long idEquipe) {

        equipeRepository.deleteById(idEquipe);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {

        return equipeRepository.save(e);
    }

    @Override
    @Scheduled(cron = "*/15 * * * * *")
    public void faireEvoluerEquipes(){
        List<Equipe> e = retrieveAllEquipes();

        for (int i=0;i< e.size();i++){
            if (e.get(i).getEtudiants().size()>3 && e.get(i).getEtudiants().size()==6){
                 log.info("c bon");
            }
        }
    }
}
