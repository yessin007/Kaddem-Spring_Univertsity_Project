package tn.esprit.spring.kaddem_new_yessin.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire

    @Column(name="prenomE")
    private String prenomE;

    @Column(name="nomE")
    private String nomE;

    //@Column(name="option")
    @Enumerated(EnumType.STRING)
    private Option option;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

    @ManyToOne
    @JsonIgnore
    Departement departement;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    @JsonIgnore
    private Set<Contrat> Contrats;

}