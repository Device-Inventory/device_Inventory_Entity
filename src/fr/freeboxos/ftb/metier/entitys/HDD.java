/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.entitys;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author alan
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "disc", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("HDD")
@SuppressWarnings("PersistenceUnitPresent")
public class HDD implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marque;
    private String modele;
    private String interface_ordinateur;
    private String format;
    private String capacite;
    private String vitesse_de_rotation;
    private String cache;
    private float prix; //todo : modifier le type d'attribut

    public HDD() {
    }

    public HDD(String marque, String modele, String interface_ordinateur, String format, String capacite, String vitesse_de_rotation, String cache, float prix) {
        this.marque = marque;
        this.modele = modele;
        this.interface_ordinateur = interface_ordinateur;
        this.format = format;
        this.capacite = capacite;
        this.vitesse_de_rotation = vitesse_de_rotation;
        this.cache = cache;
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

    public String getInterface_ordinateur() {
        return interface_ordinateur;
    }

    public void setInterface_ordinateur(String interface_ordinateur) {
        this.interface_ordinateur = interface_ordinateur;
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

    public String getVitesse_de_rotation() {
        return vitesse_de_rotation;
    }

    public void setVitesse_de_rotation(String vitesse_de_rotation) {
        this.vitesse_de_rotation = vitesse_de_rotation;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return " " + id + " " + marque + " " + modele;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 79 * hash + Objects.hashCode(this.marque);
        hash = 79 * hash + Objects.hashCode(this.modele);
        hash = 79 * hash + Objects.hashCode(this.interface_ordinateur);
        hash = 79 * hash + Objects.hashCode(this.format);
        hash = 79 * hash + Objects.hashCode(this.capacite);
        hash = 79 * hash + Objects.hashCode(this.vitesse_de_rotation);
        hash = 79 * hash + Objects.hashCode(this.cache);
        hash = 79 * hash + Objects.hashCode(this.prix);
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
        final HDD other = (HDD) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        if (!Objects.equals(this.modele, other.modele)) {
            return false;
        }
        if (!Objects.equals(this.interface_ordinateur, other.interface_ordinateur)) {
            return false;
        }
        if (!Objects.equals(this.format, other.format)) {
            return false;
        }
        if (!Objects.equals(this.capacite, other.capacite)) {
            return false;
        }
        if (!Objects.equals(this.vitesse_de_rotation, other.vitesse_de_rotation)) {
            return false;
        }
        if (!Objects.equals(this.cache, other.cache)) {
            return false;
        }
        return Objects.equals(this.prix, other.prix);
    }

}
