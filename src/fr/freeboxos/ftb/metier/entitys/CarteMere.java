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
public class CarteMere implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private String marque; //todo : enum marque carte mère
    private List<String> marque;
    private String modele;
    private String designation; //todo : marque + modele;

    private String supportDuProcesseur; //todo : enum support du processeur
    private int nombreDeCpu; // todo : nombre de cpu pouvant etre brancher sur la carte mère
    private String formatDeCarteMere; //todo : enum format de carte mère
    private String chipset; //todo : enum chipset

    private String frequenceMemoire; //todo : enum frequence memoire et faire un check list box dans ui
    private String technologieMemoire; //todo : enum technologieMemoire
    private int capaciteMaximaleRamSlot; //todo : Capacité maximale de RAM par slot
    private int capaciteMaximaleRam; //todo : Capacité maximale de RAM
    private String typeDeMemoire; //todo : enum type de memoire

    private boolean controleurGraphiqueIntegre;
    private boolean gpuInCpu; // todo : Compatible coeur graphique intégré au CPU
    private String chipsetGraphique;
    private int tailleMemoireVideo;
    private String typeMultiGpu; //todo : enum type multi gpu
    private String connecteurGraphique; //todo : enum connecteur graphique

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

    private String chipsetAudio;
    private int nombreCanauxAudio;

    private String controleurEthernet;
    private String normeReseau; //todo : remplir enum norme reseaux;

    private boolean raid;
    private String connecteurDisque; //todo : remplir enum connecteur disque carte mère
    private int modeRaid;

    private boolean led;

    private float prix;

    public CarteMere() {
    }

    //todo : finir les attribut
    public CarteMere(List<String> marque, String modele, String designation, String supportDuProcesseur, int nombreDeCpu, String formatDeCarteMere, String chipset, String frequenceMemoire, String technologieMemoire, int capaciteMaximaleRamSlot, int capaciteMaximaleRam, String typeDeMemoire, boolean controleurGraphiqueIntegre, boolean gpuInCpu, String chipsetGraphique, int tailleMemoireVideo, String typeMultiGpu, String connecteurGraphique, boolean pci, boolean pciExpress1x20, boolean pciExpress16x20, boolean pciExpress1x30, boolean pciExpress16x30, int pciNum, int pciExpress1x20Num, int pciExpress16x20Num, int pciExpress1x30Num, int pciExpress16x30Num, String chipsetAudio, int nombreCanauxAudio, String controleurEthernet, String normeReseau, boolean raid, String connecteurDisque, int modeRaid, boolean led, float prix) {
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

    public String getSupportDuProcesseur() {
        return supportDuProcesseur;
    }

    public void setSupportDuProcesseur(String supportDuProcesseur) {
        this.supportDuProcesseur = supportDuProcesseur;
    }

    public int getNombreDeCpu() {
        return nombreDeCpu;
    }

    public void setNombreDeCpu(int nombreDeCpu) {
        this.nombreDeCpu = nombreDeCpu;
    }

    public String getFormatDeCarteMere() {
        return formatDeCarteMere;
    }

    public void setFormatDeCarteMere(String formatDeCarteMere) {
        this.formatDeCarteMere = formatDeCarteMere;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public boolean getLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
    }

    public String getFrequenceMemoire() {
        return frequenceMemoire;
    }

    public void setFrequenceMemoire(String frequenceMemoire) {
        this.frequenceMemoire = frequenceMemoire;
    }

    public String getTechnologieMemoire() {
        return technologieMemoire;
    }

    public void setTechnologieMemoire(String technologieMemoire) {
        this.technologieMemoire = technologieMemoire;
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

    public String getTypeDeMemoire() {
        return typeDeMemoire;
    }

    public void setTypeDeMemoire(String typeDeMemoire) {
        this.typeDeMemoire = typeDeMemoire;
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

    public String getChipsetGraphique() {
        return chipsetGraphique;
    }

    public void setChipsetGraphique(String chipsetGraphique) {
        this.chipsetGraphique = chipsetGraphique;
    }

    public int getTailleMemoireVideo() {
        return tailleMemoireVideo;
    }

    public void setTailleMemoireVideo(int tailleMemoireVideo) {
        this.tailleMemoireVideo = tailleMemoireVideo;
    }

    public String getTypeMultiGpu() {
        return typeMultiGpu;
    }

    public void setTypeMultiGpu(String typeMultiGpu) {
        this.typeMultiGpu = typeMultiGpu;
    }

    public String getConnecteurGraphique() {
        return connecteurGraphique;
    }

    public void setConnecteurGraphique(String connecteurGraphique) {
        this.connecteurGraphique = connecteurGraphique;
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

    public String getChipsetAudio() {
        return chipsetAudio;
    }

    public void setChipsetAudio(String chipsetAudio) {
        this.chipsetAudio = chipsetAudio;
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

    public String getNormeReseau() {
        return normeReseau;
    }

    public void setNormeReseau(String normeReseau) {
        this.normeReseau = normeReseau;
    }

    public boolean getRaid() {
        return raid;
    }

    public void setRaid(boolean raid) {
        this.raid = raid;
    }

    public String getConnecteurDisque() {
        return connecteurDisque;
    }

    public void setConnecteurDisque(String connecteurDisque) {
        this.connecteurDisque = connecteurDisque;
    }

    public int getModeRaid() {
        return modeRaid;
    }

    public void setModeRaid(int modeRaid) {
        this.modeRaid = modeRaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.marque);
        hash = 17 * hash + Objects.hashCode(this.modele);
        hash = 17 * hash + Objects.hashCode(this.designation);
        hash = 17 * hash + Objects.hashCode(this.prix);
        hash = 17 * hash + Objects.hashCode(this.supportDuProcesseur);
        hash = 17 * hash + Objects.hashCode(this.nombreDeCpu);
        hash = 17 * hash + Objects.hashCode(this.formatDeCarteMere);
        hash = 17 * hash + Objects.hashCode(this.chipset);
        hash = 17 * hash + Objects.hashCode(this.led);
        hash = 17 * hash + Objects.hashCode(this.frequenceMemoire);
        hash = 17 * hash + Objects.hashCode(this.technologieMemoire);
        hash = 17 * hash + Objects.hashCode(this.capaciteMaximaleRamSlot);
        hash = 17 * hash + Objects.hashCode(this.capaciteMaximaleRam);
        hash = 17 * hash + Objects.hashCode(this.typeDeMemoire);
        hash = 17 * hash + Objects.hashCode(this.controleurGraphiqueIntegre);
        hash = 17 * hash + Objects.hashCode(this.gpuInCpu);
        hash = 17 * hash + Objects.hashCode(this.chipsetGraphique);
        hash = 17 * hash + Objects.hashCode(this.tailleMemoireVideo);
        hash = 17 * hash + Objects.hashCode(this.typeMultiGpu);
        hash = 17 * hash + Objects.hashCode(this.connecteurGraphique);
        hash = 17 * hash + Objects.hashCode(this.pci);
        hash = 17 * hash + Objects.hashCode(this.pciExpress1x20);
        hash = 17 * hash + Objects.hashCode(this.pciExpress16x20);
        hash = 17 * hash + Objects.hashCode(this.pciExpress1x30);
        hash = 17 * hash + Objects.hashCode(this.pciExpress16x30);
        hash = 17 * hash + Objects.hashCode(this.pciNum);
        hash = 17 * hash + Objects.hashCode(this.pciExpress1x20Num);
        hash = 17 * hash + Objects.hashCode(this.pciExpress16x20Num);
        hash = 17 * hash + Objects.hashCode(this.pciExpress1x30Num);
        hash = 17 * hash + Objects.hashCode(this.pciExpress16x30Num);
        hash = 17 * hash + Objects.hashCode(this.chipsetAudio);
        hash = 17 * hash + Objects.hashCode(this.nombreCanauxAudio);
        hash = 17 * hash + Objects.hashCode(this.controleurEthernet);
        hash = 17 * hash + Objects.hashCode(this.normeReseau);
        hash = 17 * hash + Objects.hashCode(this.raid);
        hash = 17 * hash + Objects.hashCode(this.connecteurDisque);
        hash = 17 * hash + Objects.hashCode(this.modeRaid);
        hash = 17 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        if (!Objects.equals(this.modele, other.modele)) {
            return false;
        }
        if (!Objects.equals(this.designation, other.designation)) {
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
        if (!Objects.equals(this.controleurEthernet, other.controleurEthernet)) {
            return false;
        }
        if (!Objects.equals(this.normeReseau, other.normeReseau)) {
            return false;
        }
        if (!Objects.equals(this.connecteurDisque, other.connecteurDisque)) {
            return false;
        }
        if (!Objects.equals(this.prix, other.prix)) {
            return false;
        }
        if (!Objects.equals(this.nombreDeCpu, other.nombreDeCpu)) {
            return false;
        }
        if (!Objects.equals(this.led, other.led)) {
            return false;
        }
        if (!Objects.equals(this.capaciteMaximaleRamSlot, other.capaciteMaximaleRamSlot)) {
            return false;
        }
        if (!Objects.equals(this.capaciteMaximaleRam, other.capaciteMaximaleRam)) {
            return false;
        }
        if (!Objects.equals(this.controleurGraphiqueIntegre, other.controleurGraphiqueIntegre)) {
            return false;
        }
        if (!Objects.equals(this.gpuInCpu, other.gpuInCpu)) {
            return false;
        }
        if (!Objects.equals(this.tailleMemoireVideo, other.tailleMemoireVideo)) {
            return false;
        }
        if (!Objects.equals(this.pci, other.pci)) {
            return false;
        }
        if (!Objects.equals(this.pciExpress1x20, other.pciExpress1x20)) {
            return false;
        }
        if (!Objects.equals(this.pciExpress16x20, other.pciExpress16x20)) {
            return false;
        }
        if (!Objects.equals(this.pciExpress1x30, other.pciExpress1x30)) {
            return false;
        }
        if (!Objects.equals(this.pciExpress16x30, other.pciExpress16x30)) {
            return false;
        }
        if (!Objects.equals(this.pciNum, other.pciNum)) {
            return false;
        }
        if (!Objects.equals(this.pciExpress1x20Num, other.pciExpress1x20Num)) {
            return false;
        }
        if (!Objects.equals(this.pciExpress16x20Num, other.pciExpress16x20Num)) {
            return false;
        }
        if (!Objects.equals(this.pciExpress1x30Num, other.pciExpress1x30Num)) {
            return false;
        }
        if (!Objects.equals(this.pciExpress16x30Num, other.pciExpress16x30Num)) {
            return false;
        }
        if (!Objects.equals(this.nombreCanauxAudio, other.nombreCanauxAudio)) {
            return false;
        }
        if (!Objects.equals(this.raid, other.raid)) {
            return false;
        }
        if (!Objects.equals(this.modeRaid, other.modeRaid)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

}
