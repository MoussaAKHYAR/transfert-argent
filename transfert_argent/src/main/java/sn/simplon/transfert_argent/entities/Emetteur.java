package sn.simplon.transfert_argent.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue(value = "EMT")
public class Emetteur extends Personne{
    private String cin;

    public Emetteur() {
        super();
    }

    public Emetteur(int id, String nom, String prenom, String telephone, List<Envoi> listEnvoi, String cin) {
        super(id, nom, prenom, telephone, listEnvoi);
        this.cin = cin;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
