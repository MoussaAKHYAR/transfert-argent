package sn.simplon.transfert_argent.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSONNE", discriminatorType = DiscriminatorType.STRING,length = 3)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    @OneToMany(mappedBy = "personne")
    private List<Envoi> listEnvoi = new ArrayList<Envoi>();

    public Personne() {
    }

    public Personne(int id, String nom, String prenom, String telephone, List<Envoi> listEnvoi) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.listEnvoi = listEnvoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Envoi> getListEnvoi() {
        return listEnvoi;
    }

    public void setListEnvoi(List<Envoi> listEnvoi) {
        this.listEnvoi = listEnvoi;
    }



}
