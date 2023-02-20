package tn.esprit.spring.kaddem_new_yessin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.kaddem_new_yessin.entities.*;

import java.util.List;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {

}
