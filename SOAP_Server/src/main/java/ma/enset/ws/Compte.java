package ma.enset.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name = "comte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
     private int id;
     private double solde;
     @XmlTransient
     private Date date;

    public Compte() {
    }

    public Compte(int id, double solde, Date date) {
        this.id = id;
        this.solde = solde;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
