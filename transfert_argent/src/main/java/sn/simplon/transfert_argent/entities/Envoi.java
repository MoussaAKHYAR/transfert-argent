package sn.simplon.transfert_argent.entities;

import javax.persistence.*;

@Entity
public class Envoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double montant;
    private String date;
    @ManyToOne()
    private Personne personne = new Personne();


    public Envoi() {
    }

    public Envoi(int id, double montant, String date, Personne personne) {
        this.id = id;
        this.montant = montant;
        this.date = date;
        this.personne = personne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }


}
