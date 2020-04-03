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
import java.util.List;
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
@SuppressWarnings("PersistenceUnitPresent")
public class CarteMere implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private String marque; //todo : enum marque carte mère
    private List<String> marque;
    private String modele;
    private String designation; //todo : marque + modele;

    private List<String> supportDuProcesseur; //todo : enum support du processeur
    private int nombreDeCpu; // todo : nombre de cpu pouvant etre brancher sur la carte mère
    private List<String> formatDeCarteMere; //todo : enum format de carte mère
    private List<String> chipset; //todo : enum chipset

    private List<String> frequenceMemoire; //todo : enum frequence memoire et faire un check list box dans ui
    private List<String> technologieMemoire; //todo : enum technologieMemoire
    private int capaciteMaximaleRamSlot; //todo : Capacité maximale de RAM par slot
    private int capaciteMaximaleRam; //todo : Capacité maximale de RAM
    private List<String> typeDeMemoire; //todo : enum type de memoire

    private boolean controleurGraphiqueIntegre;
    private boolean gpuInCpu; // todo : Compatible coeur graphique intégré au CPU
    private List<String> chipsetGraphique;
    private int tailleMemoireVideo;
    private List<String> typeMultiGpu; //todo : enum type multi gpu
    private List<String> connecteurGraphique; //todo : enum connecteur graphique

    private boolean pci;
    private boolean pciExpress1x20; //todo : pci express 2.0
    private boolean pciExpress16x20;
    private boolean pciExpress1x30;
    private boolean pciExpress16x30;
    private int pciNum;
    private int pciExpress1x20Num;
    private int pciExpress16x20Num;
    private int pciExpress1x30Num;
    private int pciExpress16x30Num;

    private List<String> chipsetAudio;
    private int nombreCanauxAudio;

    private String controleurEthernet;
    private List<String> normeReseau; //todo : remplir enum norme reseaux;

    private boolean raid;
    private List<String> connecteurDisque; //todo : remplir enum connecteur disque carte mère
    private List<String> modeRaid;

    private boolean led;

    private float prix;

    public CarteMere() {
    }

    //todo : finir les attribut
    public CarteMere(List<String> marque, String modele, String designation, List<String> supportDuProcesseur, int nombreDeCpu, List<String> formatDeCarteMere, List<String> chipset, List<String> frequenceMemoire, List<String> technologieMemoire, int capaciteMaximaleRamSlot, int capaciteMaximaleRam, List<String> typeDeMemoire, boolean controleurGraphiqueIntegre, boolean gpuInCpu, List<String> chipsetGraphique, int tailleMemoireVideo, List<String> typeMultiGpu, List<String> connecteurGraphique, boolean pci, boolean pciExpress1x20, boolean pciExpress16x20, boolean pciExpress1x30, boolean pciExpress16x30, int pciNum, int pciExpress1x20Num, int pciExpress16x20Num, int pciExpress1x30Num, int pciExpress16x30Num, List<String> chipsetAudio, int nombreCanauxAudio, String controleurEthernet, List<String> normeReseau, boolean raid, List<String> connecteurDisque, List<String> modeRaid, boolean led, float prix) {
        this.marque = marque;
        this.modele = modele;
        this.designation = designation;
        this.supportDuProcesseur = supportDuProcesseur;
        this.nombreDeCpu = nombreDeCpu;
        this.formatDeCarteMere = formatDeCarteMere;
        this.chipset = chipset;
        this.frequenceMemoire = frequenceMemoire;
        this.technologieMemoire = technologieMemoire;
        this.capaciteMaximaleRamSlot = capaciteMaximaleRamSlot;
        this.capaciteMaximaleRam = capaciteMaximaleRam;
        this.typeDeMemoire = typeDeMemoire;
        this.controleurGraphiqueIntegre = controleurGraphiqueIntegre;
        this.gpuInCpu = gpuInCpu;
        this.chipsetGraphique = chipsetGraphique;
        this.tailleMemoireVideo = tailleMemoireVideo;
        this.typeMultiGpu = typeMultiGpu;
        this.connecteurGraphique = connecteurGraphique;
        this.pci = pci;
        this.pciExpress1x20 = pciExpress1x20;
        this.pciExpress16x20 = pciExpress16x20;
        this.pciExpress1x30 = pciExpress1x30;
        this.pciExpress16x30 = pciExpress16x30;
        this.pciNum = pciNum;
        this.pciExpress1x20Num = pciExpress1x20Num;
        this.pciExpress16x20Num = pciExpress16x20Num;
        this.pciExpress1x30Num = pciExpress1x30Num;
        this.pciExpress16x30Num = pciExpress16x30Num;
        this.chipsetAudio = chipsetAudio;
        this.nombreCanauxAudio = nombreCanauxAudio;
        this.controleurEthernet = controleurEthernet;
        this.normeReseau = normeReseau;
        this.raid = raid;
        this.connecteurDisque = connecteurDisque;
        this.modeRaid = modeRaid;
        this.led = led;
        this.prix = prix;
    }

    public List<String> getMarque() {
        return marque;
    }

    public void setMarque(List<String> marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getNombreDeCpu() {
        return nombreDeCpu;
    }

    public void setNombreDeCpu(int nombreDeCpu) {
        this.nombreDeCpu = nombreDeCpu;
    }

    public boolean getLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
    }

    public int getCapaciteMaximaleRamSlot() {
        return capaciteMaximaleRamSlot;
    }

    public void setCapaciteMaximaleRamSlot(int capaciteMaximaleRamSlot) {
        this.capaciteMaximaleRamSlot = capaciteMaximaleRamSlot;
    }

    public int getCapaciteMaximaleRam() {
        return capaciteMaximaleRam;
    }

    public void setCapaciteMaximaleRam(int capaciteMaximaleRam) {
        this.capaciteMaximaleRam = capaciteMaximaleRam;
    }

    public boolean getControleurGraphiqueIntegre() {
        return controleurGraphiqueIntegre;
    }

    public void setControleurGraphiqueIntegre(boolean controleurGraphiqueIntegre) {
        this.controleurGraphiqueIntegre = controleurGraphiqueIntegre;
    }

    public boolean getGpuInCpu() {
        return gpuInCpu;
    }

    public void setGpuInCpu(boolean gpuInCpu) {
        this.gpuInCpu = gpuInCpu;
    }

    public int getTailleMemoireVideo() {
        return tailleMemoireVideo;
    }

    public void setTailleMemoireVideo(int tailleMemoireVideo) {
        this.tailleMemoireVideo = tailleMemoireVideo;
    }

    public boolean getPci() {
        return pci;
    }

    public void setPci(boolean pci) {
        this.pci = pci;
    }

    public boolean getPciExpress1x20() {
        return pciExpress1x20;
    }

    public void setPciExpress1x20(boolean pciExpress1x20) {
        this.pciExpress1x20 = pciExpress1x20;
    }

    public boolean getPciExpress16x20() {
        return pciExpress16x20;
    }

    public void setPciExpress16x20(boolean pciExpress16x20) {
        this.pciExpress16x20 = pciExpress16x20;
    }

    public boolean getPciExpress1x30() {
        return pciExpress1x30;
    }

    public void setPciExpress1x30(boolean pciExpress1x30) {
        this.pciExpress1x30 = pciExpress1x30;
    }

    public boolean getPciExpress16x30() {
        return pciExpress16x30;
    }

    public void setPciExpress16x30(boolean pciExpress16x30) {
        this.pciExpress16x30 = pciExpress16x30;
    }

    public int getPciNum() {
        return pciNum;
    }

    public void setPciNum(int pciNum) {
        this.pciNum = pciNum;
    }

    public int getPciExpress1x20Num() {
        return pciExpress1x20Num;
    }

    public void setPciExpress1x20Num(int pciExpress1x20Num) {
        this.pciExpress1x20Num = pciExpress1x20Num;
    }

    public int getPciExpress16x20Num() {
        return pciExpress16x20Num;
    }

    public void setPciExpress16x20Num(int pciExpress16x20Num) {
        this.pciExpress16x20Num = pciExpress16x20Num;
    }

    public int getPciExpress1x30Num() {
        return pciExpress1x30Num;
    }

    public void setPciExpress1x30Num(int pciExpress1x30Num) {
        this.pciExpress1x30Num = pciExpress1x30Num;
    }

    public int getPciExpress16x30Num() {
        return pciExpress16x30Num;
    }

    public void setPciExpress16x30Num(int pciExpress16x30Num) {
        this.pciExpress16x30Num = pciExpress16x30Num;
    }

    public int getNombreCanauxAudio() {
        return nombreCanauxAudio;
    }

    public void setNombreCanauxAudio(int nombreCanauxAudio) {
        this.nombreCanauxAudio = nombreCanauxAudio;
    }

    public String getControleurEthernet() {
        return controleurEthernet;
    }

    public void setControleurEthernet(String controleurEthernet) {
        this.controleurEthernet = controleurEthernet;
    }

    public boolean getRaid() {
        return raid;
    }

    public void setRaid(boolean raid) {
        this.raid = raid;
    }

    public List<String> getModeRaid() {
        return modeRaid;
    }

    public void setModeRaid(List<String> modeRaid) {
        this.modeRaid = modeRaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getSupportDuProcesseur() {
        return supportDuProcesseur;
    }

    public void setSupportDuProcesseur(List<String> supportDuProcesseur) {
        this.supportDuProcesseur = supportDuProcesseur;
    }

    public List<String> getFormatDeCarteMere() {
        return formatDeCarteMere;
    }

    public void setFormatDeCarteMere(List<String> formatDeCarteMere) {
        this.formatDeCarteMere = formatDeCarteMere;
    }

    public List<String> getChipset() {
        return chipset;
    }

    public void setChipset(List<String> chipset) {
        this.chipset = chipset;
    }

    public List<String> getFrequenceMemoire() {
        return frequenceMemoire;
    }

    public void setFrequenceMemoire(List<String> frequenceMemoire) {
        this.frequenceMemoire = frequenceMemoire;
    }

    public List<String> getTechnologieMemoire() {
        return technologieMemoire;
    }

    public void setTechnologieMemoire(List<String> technologieMemoire) {
        this.technologieMemoire = technologieMemoire;
    }

    public List<String> getTypeDeMemoire() {
        return typeDeMemoire;
    }

    public void setTypeDeMemoire(List<String> typeDeMemoire) {
        this.typeDeMemoire = typeDeMemoire;
    }

    public List<String> getChipsetGraphique() {
        return chipsetGraphique;
    }

    public void setChipsetGraphique(List<String> chipsetGraphique) {
        this.chipsetGraphique = chipsetGraphique;
    }

    public List<String> getTypeMultiGpu() {
        return typeMultiGpu;
    }

    public void setTypeMultiGpu(List<String> typeMultiGpu) {
        this.typeMultiGpu = typeMultiGpu;
    }

    public List<String> getConnecteurGraphique() {
        return connecteurGraphique;
    }

    public void setConnecteurGraphique(List<String> connecteurGraphique) {
        this.connecteurGraphique = connecteurGraphique;
    }

    public List<String> getChipsetAudio() {
        return chipsetAudio;
    }

    public void setChipsetAudio(List<String> chipsetAudio) {
        this.chipsetAudio = chipsetAudio;
    }

    public List<String> getNormeReseau() {
        return normeReseau;
    }

    public void setNormeReseau(List<String> normeReseau) {
        this.normeReseau = normeReseau;
    }

    public List<String> getConnecteurDisque() {
        return connecteurDisque;
    }

    public void setConnecteurDisque(List<String> connecteurDisque) {
        this.connecteurDisque = connecteurDisque;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.marque);
        hash = 71 * hash + Objects.hashCode(this.modele);
        hash = 71 * hash + Objects.hashCode(this.designation);
        hash = 71 * hash + Objects.hashCode(this.supportDuProcesseur);
        hash = 71 * hash + this.nombreDeCpu;
        hash = 71 * hash + Objects.hashCode(this.formatDeCarteMere);
        hash = 71 * hash + Objects.hashCode(this.chipset);
        hash = 71 * hash + Objects.hashCode(this.frequenceMemoire);
        hash = 71 * hash + Objects.hashCode(this.technologieMemoire);
        hash = 71 * hash + this.capaciteMaximaleRamSlot;
        hash = 71 * hash + this.capaciteMaximaleRam;
        hash = 71 * hash + Objects.hashCode(this.typeDeMemoire);
        hash = 71 * hash + (this.controleurGraphiqueIntegre ? 1 : 0);
        hash = 71 * hash + (this.gpuInCpu ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.chipsetGraphique);
        hash = 71 * hash + this.tailleMemoireVideo;
        hash = 71 * hash + Objects.hashCode(this.typeMultiGpu);
        hash = 71 * hash + Objects.hashCode(this.connecteurGraphique);
        hash = 71 * hash + (this.pci ? 1 : 0);
        hash = 71 * hash + (this.pciExpress1x20 ? 1 : 0);
        hash = 71 * hash + (this.pciExpress16x20 ? 1 : 0);
        hash = 71 * hash + (this.pciExpress1x30 ? 1 : 0);
        hash = 71 * hash + (this.pciExpress16x30 ? 1 : 0);
        hash = 71 * hash + this.pciNum;
        hash = 71 * hash + this.pciExpress1x20Num;
        hash = 71 * hash + this.pciExpress16x20Num;
        hash = 71 * hash + this.pciExpress1x30Num;
        hash = 71 * hash + this.pciExpress16x30Num;
        hash = 71 * hash + Objects.hashCode(this.chipsetAudio);
        hash = 71 * hash + this.nombreCanauxAudio;
        hash = 71 * hash + Objects.hashCode(this.controleurEthernet);
        hash = 71 * hash + Objects.hashCode(this.normeReseau);
        hash = 71 * hash + (this.raid ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.connecteurDisque);
        hash = 71 * hash + Objects.hashCode(this.modeRaid);
        hash = 71 * hash + (this.led ? 1 : 0);
        hash = 71 * hash + Float.floatToIntBits(this.prix);
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
        final CarteMere other = (CarteMere) obj;
        if (this.nombreDeCpu != other.nombreDeCpu) {
            return false;
        }
        if (this.capaciteMaximaleRamSlot != other.capaciteMaximaleRamSlot) {
            return false;
        }
        if (this.capaciteMaximaleRam != other.capaciteMaximaleRam) {
            return false;
        }
        if (this.controleurGraphiqueIntegre != other.controleurGraphiqueIntegre) {
            return false;
        }
        if (this.gpuInCpu != other.gpuInCpu) {
            return false;
        }
        if (this.tailleMemoireVideo != other.tailleMemoireVideo) {
            return false;
        }
        if (this.pci != other.pci) {
            return false;
        }
        if (this.pciExpress1x20 != other.pciExpress1x20) {
            return false;
        }
        if (this.pciExpress16x20 != other.pciExpress16x20) {
            return false;
        }
        if (this.pciExpress1x30 != other.pciExpress1x30) {
            return false;
        }
        if (this.pciExpress16x30 != other.pciExpress16x30) {
            return false;
        }
        if (this.pciNum != other.pciNum) {
            return false;
        }
        if (this.pciExpress1x20Num != other.pciExpress1x20Num) {
            return false;
        }
        if (this.pciExpress16x20Num != other.pciExpress16x20Num) {
            return false;
        }
        if (this.pciExpress1x30Num != other.pciExpress1x30Num) {
            return false;
        }
        if (this.pciExpress16x30Num != other.pciExpress16x30Num) {
            return false;
        }
        if (this.nombreCanauxAudio != other.nombreCanauxAudio) {
            return false;
        }
        if (this.raid != other.raid) {
            return false;
        }
        if (this.led != other.led) {
            return false;
        }
        if (Float.floatToIntBits(this.prix) != Float.floatToIntBits(other.prix)) {
            return false;
        }
        if (!Objects.equals(this.modele, other.modele)) {
            return false;
        }
        if (!Objects.equals(this.designation, other.designation)) {
            return false;
        }
        if (!Objects.equals(this.controleurEthernet, other.controleurEthernet)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        if (!Objects.equals(this.supportDuProcesseur, other.supportDuProcesseur)) {
            return false;
        }
        if (!Objects.equals(this.formatDeCarteMere, other.formatDeCarteMere)) {
            return false;
        }
        if (!Objects.equals(this.chipset, other.chipset)) {
            return false;
        }
        if (!Objects.equals(this.frequenceMemoire, other.frequenceMemoire)) {
            return false;
        }
        if (!Objects.equals(this.technologieMemoire, other.technologieMemoire)) {
            return false;
        }
        if (!Objects.equals(this.typeDeMemoire, other.typeDeMemoire)) {
            return false;
        }
        if (!Objects.equals(this.chipsetGraphique, other.chipsetGraphique)) {
            return false;
        }
        if (!Objects.equals(this.typeMultiGpu, other.typeMultiGpu)) {
            return false;
        }
        if (!Objects.equals(this.connecteurGraphique, other.connecteurGraphique)) {
            return false;
        }
        if (!Objects.equals(this.chipsetAudio, other.chipsetAudio)) {
            return false;
        }
        if (!Objects.equals(this.normeReseau, other.normeReseau)) {
            return false;
        }
        if (!Objects.equals(this.connecteurDisque, other.connecteurDisque)) {
            return false;
        }
        return Objects.equals(this.modeRaid, other.modeRaid);
    }

}
