package tn.esprit.spring.kaddem_new_yessin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table( name = "Equipe")
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Long idEquipe; // Clé primaire

    @Column(name="nomEquipe")
    private String nomEquipe;

    //@Column(name="niveau")
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ManyToMany(mappedBy = "equipes", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Etudiant> etudiants;

    @OneToOne
    @JsonIgnore
    private DetailEquipe detailEquipe;
}
