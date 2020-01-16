/*
 * Copyright (C) 2020 alan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
public class CarteGraphique implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marque;
    private String modele;
    private String chipsetGraphique;
    private String marqueChipset;
    private int frequence;
    private boolean overclockee;
    private int nombreGpu;
    private String bus;
    private int tailleMemoire;
    private String uniteMemoire; //todo: ajouter Ko, Mo, Go dans le jtable
    private int interfaceMemoire; //todo: rajouter "bit(s)" dans le jtable
    private String typeMemoire;
    private String connecteurAlimentation;
    private int consommation; //todo: rajouter "W" dans le jtable
    private float prix;

    public CarteGraphique() {
    }

    public CarteGraphique(String marque, String modele, String chipsetGraphique, String marqueChipset, int frequence, boolean overclockee, int nombreGpu, String bus, int tailleMemoire, String uniteMemoire, int interfaceMemoire, String typeMemoire, String connecteurAlimentation, int consommation, float prix) {
        this.marque = marque;
        this.modele = modele;
        this.chipsetGraphique = chipsetGraphique;
        this.marqueChipset = marqueChipset;
        this.frequence = frequence;
        this.overclockee = overclockee;
        this.nombreGpu = nombreGpu;
        this.bus = bus;
        this.tailleMemoire = tailleMemoire;
        this.uniteMemoire = uniteMemoire;
        this.interfaceMemoire = interfaceMemoire;
        this.typeMemoire = typeMemoire;
        this.connecteurAlimentation = connecteurAlimentation;
        this.consommation = consommation;
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

    public String getChipsetGraphique() {
        return chipsetGraphique;
    }

    public void setChipsetGraphique(String chipsetGraphique) {
        this.chipsetGraphique = chipsetGraphique;
    }

    public String getMarqueChipset() {
        return marqueChipset;
    }

    public void setMarqueChipset(String marqueChipset) {
        this.marqueChipset = marqueChipset;
    }

    public int getFrequence() {
        return frequence;
    }

    public void setFrequence(int frequence) {
        this.frequence = frequence;
    }

    public boolean isOverclockee() {
        return overclockee;
    }

    public void setOverclockee(boolean overclockee) {
        this.overclockee = overclockee;
    }

    public int getNombreGpu() {
        return nombreGpu;
    }

    public void setNombreGpu(int nombreGpu) {
        this.nombreGpu = nombreGpu;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public int getTailleMemoire() {
        return tailleMemoire;
    }

    public void setTailleMemoire(int tailleMemoire) {
        this.tailleMemoire = tailleMemoire;
    }

    public String getUniteMemoire() {
        return uniteMemoire;
    }

    public void setUniteMemoire(String uniteMemoire) {
        this.uniteMemoire = uniteMemoire;
    }

    public int getInterfaceMemoire() {
        return interfaceMemoire;
    }

    public void setInterfaceMemoire(int interfaceMemoire) {
        this.interfaceMemoire = interfaceMemoire;
    }

    public String getTypeMemoire() {
        return typeMemoire;
    }

    public void setTypeMemoire(String typeMemoire) {
        this.typeMemoire = typeMemoire;
    }

    public String getConnecteurAlimentation() {
        return connecteurAlimentation;
    }

    public void setConnecteurAlimentation(String connecteurAlimentation) {
        this.connecteurAlimentation = connecteurAlimentation;
    }

    public int getConsommation() {
        return consommation;
    }

    public void setConsommation(int consommation) {
        this.consommation = consommation;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + Objects.hashCode(this.marque);
        hash = 67 * hash + Objects.hashCode(this.modele);
        hash = 67 * hash + Objects.hashCode(this.chipsetGraphique);
        hash = 67 * hash + Objects.hashCode(this.marqueChipset);
        hash = 67 * hash + this.frequence;
        hash = 67 * hash + (this.overclockee ? 1 : 0);
        hash = 67 * hash + this.nombreGpu;
        hash = 67 * hash + Objects.hashCode(this.bus);
        hash = 67 * hash + this.tailleMemoire;
        hash = 67 * hash + Objects.hashCode(this.uniteMemoire);
        hash = 67 * hash + this.interfaceMemoire;
        hash = 67 * hash + Objects.hashCode(this.typeMemoire);
        hash = 67 * hash + Objects.hashCode(this.connecteurAlimentation);
        hash = 67 * hash + this.consommation;
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
        final CarteGraphique other = (CarteGraphique) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.frequence != other.frequence) {
            return false;
        }
        if (this.overclockee != other.overclockee) {
            return false;
        }
        if (this.nombreGpu != other.nombreGpu) {
            return false;
        }
        if (this.tailleMemoire != other.tailleMemoire) {
            return false;
        }
        if (this.interfaceMemoire != other.interfaceMemoire) {
            return false;
        }
        if (this.consommation != other.consommation) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        if (!Objects.equals(this.modele, other.modele)) {
            return false;
        }
        if (!Objects.equals(this.chipsetGraphique, other.chipsetGraphique)) {
            return false;
        }
        if (!Objects.equals(this.marqueChipset, other.marqueChipset)) {
            return false;
        }
        if (!Objects.equals(this.bus, other.bus)) {
            return false;
        }
        if (!Objects.equals(this.uniteMemoire, other.uniteMemoire)) {
            return false;
        }
        if (!Objects.equals(this.typeMemoire, other.typeMemoire)) {
            return false;
        }
        if (!Objects.equals(this.connecteurAlimentation, other.connecteurAlimentation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + " " + marque + " " + modele;
    }

}
