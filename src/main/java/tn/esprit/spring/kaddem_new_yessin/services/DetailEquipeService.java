package tn.esprit.spring.kaddem_new_yessin.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.kaddem_new_yessin.repository.DetailEquipeRepository;
import tn.esprit.spring.kaddem_new_yessin.entities.*;
//import tn.esprit.spring.kaddem_new_yessin.repository.*;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class DetailEquipeService implements InterfaceDetailEquipeService {

    DetailEquipeRepository equipeRepository;

    @Override
    public List<DetailEquipe> retrieveAllDetailEquipes() {

        return equipeRepository.findAll();
    }

    @Override
    public DetailEquipe retrieveDetailEquipe(Long idDetailEquipe) {
        return equipeRepository.findById(idDetailEquipe).get();
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe e) {

        return equipeRepository.save(e);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe e) {

        return equipeRepository.save(e);
    }

    @Override
    public void deleteDetailEquipe(Long idDetailEquipe) {

        equipeRepository.deleteById(idDetailEquipe);
    }
}
