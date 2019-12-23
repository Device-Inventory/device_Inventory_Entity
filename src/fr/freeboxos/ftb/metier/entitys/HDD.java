/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.entitys;

import java.io.Serializable;
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
    private String prix;

    public HDD() {
    }

    public HDD(String marque, String modele, String interface_ordinateur, String format, String capacite, String vitesse_de_rotation, String cache, String prix) {
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

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "HDD{" + "id=" + id + ", marque=" + marque + ", modele=" + modele + ", interface_ordinateur=" + interface_ordinateur + ", format=" + format + ", capacite=" + capacite + ", vitesse_de_rotation=" + vitesse_de_rotation + ", cache=" + cache + ", prix=" + prix + '}';
    }

}
