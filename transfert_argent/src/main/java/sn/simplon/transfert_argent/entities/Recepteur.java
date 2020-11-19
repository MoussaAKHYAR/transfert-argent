package sn.simplon.transfert_argent.entities;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "REC")
public class Recepteur extends Personne {
    public Recepteur() {
        super();
    }
}
