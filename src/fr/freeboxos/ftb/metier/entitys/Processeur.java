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
public class Processeur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marque;
    private String modele;
    private String socket;
    private String frequence;
    private String turbo;
    private int core;
    private int thread;
    private String plateforme_nom;
    private String finesse_gravure;
    private String TDP;
    private String L1;
    private String L2;
    private String L3;
    private String prix; //todo : modifier le type d'attribut

    public Processeur() {
    }

    public Processeur(String marque, String modele, String socket, String frequence, String turbo, int core, int thread, String plateforme_nom, String finesse_gravure, String TDP, String L1, String L2, String L3, String prix) {
        this.marque = marque;
        this.modele = modele;
        this.socket = socket;
        this.frequence = frequence;
        this.turbo = turbo;
        this.core = core;
        this.thread = thread;
        this.plateforme_nom = plateforme_nom;
        this.finesse_gravure = finesse_gravure;
        this.TDP = TDP;
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
        this.prix = prix;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getThread() {
        return thread;
    }

    public void setThread(int thread) {
        this.thread = thread;
    }

    public String getPlateforme_nom() {
        return plateforme_nom;
    }

    public void setPlateforme_nom(String plateforme_nom) {
        this.plateforme_nom = plateforme_nom;
    }

    public String getFinesse_gravure() {
        return finesse_gravure;
    }

    public void setFinesse_gravure(String finesse_gravure) {
        this.finesse_gravure = finesse_gravure;
    }

    public String getTDP() {
        return TDP;
    }

    public void setTDP(String TDP) {
        this.TDP = TDP;
    }

    public String getL1() {
        return L1;
    }

    public void setL1(String L1) {
        this.L1 = L1;
    }

    public String getL2() {
        return L2;
    }

    public void setL2(String L2) {
        this.L2 = L2;
    }

    public String getL3() {
        return L3;
    }

    public void setL3(String L3) {
        this.L3 = L3;
    }

    @Override
    public String toString() {
        return id + " " + marque + " " + modele;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + Objects.hashCode(this.marque);
        hash = 59 * hash + Objects.hashCode(this.modele);
        hash = 59 * hash + Objects.hashCode(this.socket);
        hash = 59 * hash + Objects.hashCode(this.frequence);
        hash = 59 * hash + Objects.hashCode(this.turbo);
        hash = 59 * hash + this.core;
        hash = 59 * hash + this.thread;
        hash = 59 * hash + Objects.hashCode(this.plateforme_nom);
        hash = 59 * hash + Objects.hashCode(this.finesse_gravure);
        hash = 59 * hash + Objects.hashCode(this.TDP);
        hash = 59 * hash + Objects.hashCode(this.L1);
        hash = 59 * hash + Objects.hashCode(this.L2);
        hash = 59 * hash + Objects.hashCode(this.L3);
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
        final Processeur other = (Processeur) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.core != other.core) {
            return false;
        }
        if (this.thread != other.thread) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        if (!Objects.equals(this.modele, other.modele)) {
            return false;
        }
        if (!Objects.equals(this.socket, other.socket)) {
            return false;
        }
        if (!Objects.equals(this.frequence, other.frequence)) {
            return false;
        }
        if (!Objects.equals(this.turbo, other.turbo)) {
            return false;
        }
        if (!Objects.equals(this.plateforme_nom, other.plateforme_nom)) {
            return false;
        }
        if (!Objects.equals(this.finesse_gravure, other.finesse_gravure)) {
            return false;
        }
        if (!Objects.equals(this.TDP, other.TDP)) {
            return false;
        }
        if (!Objects.equals(this.L1, other.L1)) {
            return false;
        }
        if (!Objects.equals(this.L2, other.L2)) {
            return false;
        }
        if (!Objects.equals(this.L3, other.L3)) {
            return false;
        }
        if (!Objects.equals(this.prix, other.prix)) {
            return false;
        }
        return true;
    }

}
