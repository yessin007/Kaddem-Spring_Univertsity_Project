package tn.esprit.spring.kaddem_new_yessin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.swing.text.html.Option;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table( name = "Contrat")
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Long idContrat; // Clé primaire

    //@Column(name="dateDebutContrat")
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;

    //@Column(name="dateFinContrat")
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;

    //@Column(name="specialite")
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @Column(name="archive")
    private Boolean archive;

    @Column(name="montantContrat")
    private Integer montantContrat;

    @ManyToOne
    @JsonIgnore
    Etudiant etudiant;

}
