/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.entitys;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author alan
 */
@Entity
public class Memoire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marque;
    private String modele;
    private String type;
    private String format;
    private String capacite;
    private String frequence_memoire;
    private String ECC;
    private String radiateur;
    private String tension;
    private String prix; //todo : modifier le type d'attribut

    public Memoire() {
    }

    public Memoire(String marque, String modele, String type, String format, String capacite, String frequence_memoire, String ECC, String radiateur, String tension, String prix) {
        this.marque = marque;
        this.modele = modele;
        this.type = type;
        this.format = format;
        this.capacite = capacite;
        this.frequence_memoire = frequence_memoire;
        this.ECC = ECC;
        this.radiateur = radiateur;
        this.tension = tension;
        this.prix = prix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }

    public String getFrequence_memoire() {
        return frequence_memoire;
    }

    public void setFrequence_memoire(String frequence_memoire) {
        this.frequence_memoire = frequence_memoire;
    }

    public String getECC() {
        return ECC;
    }

    public void setECC(String ECC) {
        this.ECC = ECC;
    }

    public String getRadiateur() {
        return radiateur;
    }

    public void setRadiateur(String radiateur) {
        this.radiateur = radiateur;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return id + " " + marque + " " + modele;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + Objects.hashCode(this.marque);
        hash = 59 * hash + Objects.hashCode(this.modele);
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + Objects.hashCode(this.format);
        hash = 59 * hash + Objects.hashCode(this.capacite);
        hash = 59 * hash + Objects.hashCode(this.frequence_memoire);
        hash = 59 * hash + Objects.hashCode(this.ECC);
        hash = 59 * hash + Objects.hashCode(this.radiateur);
        hash = 59 * hash + Objects.hashCode(this.tension);
        hash = 59 * hash + Objects.hashCode(this.prix);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Memoire other = (Memoire) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        if (!Objects.equals(this.modele, other.modele)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.format, other.format)) {
            return false;
        }
        if (!Objects.equals(this.capacite, other.capacite)) {
            return false;
        }
        if (!Objects.equals(this.frequence_memoire, other.frequence_memoire)) {
            return false;
        }
        if (!Objects.equals(this.ECC, other.ECC)) {
            return false;
        }
        if (!Objects.equals(this.radiateur, other.radiateur)) {
            return false;
        }
        if (!Objects.equals(this.tension, other.tension)) {
            return false;
        }
        if (!Objects.equals(this.prix, other.prix)) {
            return false;
        }
        return true;
    }

}
