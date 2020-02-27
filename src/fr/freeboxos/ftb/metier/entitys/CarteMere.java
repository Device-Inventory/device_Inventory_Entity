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
public class CarteMere implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque; //todo : enum marque carte mère
    private String modele;
    private String designation; //todo : marque + modele;

    private String supportDuProcesseur; //todo : enum support du processeur
    private Integer nombreDeCpu; // todo : nombre de cpu pouvant etre brancher sur la carte mère
    private String formatDeCarteMere; //todo : enum format de carte mère
    private String chipset; //todo : enum chipset

    private String frequenceMemoire; //todo : enum frequence memoire et faire un check list box dans ui
    private String technologieMemoire; //todo : enum technologieMemoire
    private Integer capaciteMaximaleRamSlot; //todo : Capacité maximale de RAM par slot
    private Integer capaciteMaximaleRam; //todo : Capacité maximale de RAM
    private String typeDeMemoire; //todo : enum type de memoire

    private Boolean controleurGraphiqueIntegre;
    private Boolean gpuInCpu; // todo : Compatible coeur graphique intégré au CPU
    private String chipsetGraphique;
    private Integer tailleMemoireVideo;
    private String typeMultiGpu; //todo : enum type multi gpu
    private String connecteurGraphique; //todo : enum connecteur graphique

    private Boolean pci;
    private Boolean pciExpress1x20; //todo : pci express 2.0
    private Boolean pciExpress16x20;
    private Boolean pciExpress1x30;
    private Boolean pciExpress16x30;
    private Integer pciNum;
    private Integer pciExpress1x20Num;
    private Integer pciExpress16x20Num;
    private Integer pciExpress1x30Num;
    private Integer pciExpress16x30Num;

    private String chipsetAudio;
    private Integer nombreCanauxAudio;

    private String controleurEthernet;
    private String normeReseau; //todo : remplir enum norme reseaux;

    private Boolean raid;
    private String connecteurDisque; //todo : remplir enum connecteur disque carte mère
    private Integer modeRaid;

    private Boolean led;

    private Float prix;

    public CarteMere() {
    }

    //todo : finir les attribut
    public CarteMere(String marque, String modele, String designation, Float prix, String supportDuProcesseur, Integer nombreDeCpu, String formatDeCarteMere, String chipset, Boolean led, String frequenceMemoire, String technologieMemoire, Integer capaciteMaximaleRamSlot, Integer capaciteMaximaleRam, String typeDeMemoire, Boolean controleurGraphiqueIntegre, Boolean gpuInCpu, String chipsetGraphique, Integer tailleMemoireVideo, String typeMultiGpu, String connecteurGraphique, Boolean pci, Boolean pciExpress1x20, Boolean pciExpress16x20, Boolean pciExpress1x30, Boolean pciExpress16x30, Integer pciNum, Integer pciExpress1x20Num, Integer pciExpress16x20Num, Integer pciExpress1x30Num, Integer pciExpress16x30Num, String chipsetAudio, Integer nombreCanauxAudio, String controleurEthernet, String normeReseau, Boolean raid, String connecteurDisque, Integer modeRaid) {
        this.marque = marque;
        this.modele = modele;
        this.designation = designation;
        this.prix = prix;
        this.supportDuProcesseur = supportDuProcesseur;
        this.nombreDeCpu = nombreDeCpu;
        this.formatDeCarteMere = formatDeCarteMere;
        this.chipset = chipset;
        this.led = led;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getSupportDuProcesseur() {
        return supportDuProcesseur;
    }

    public void setSupportDuProcesseur(String supportDuProcesseur) {
        this.supportDuProcesseur = supportDuProcesseur;
    }

    public Integer getNombreDeCpu() {
        return nombreDeCpu;
    }

    public void setNombreDeCpu(Integer nombreDeCpu) {
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

    public Boolean getLed() {
        return led;
    }

    public void setLed(Boolean led) {
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

    public Integer getCapaciteMaximaleRamSlot() {
        return capaciteMaximaleRamSlot;
    }

    public void setCapaciteMaximaleRamSlot(Integer capaciteMaximaleRamSlot) {
        this.capaciteMaximaleRamSlot = capaciteMaximaleRamSlot;
    }

    public Integer getCapaciteMaximaleRam() {
        return capaciteMaximaleRam;
    }

    public void setCapaciteMaximaleRam(Integer capaciteMaximaleRam) {
        this.capaciteMaximaleRam = capaciteMaximaleRam;
    }

    public String getTypeDeMemoire() {
        return typeDeMemoire;
    }

    public void setTypeDeMemoire(String typeDeMemoire) {
        this.typeDeMemoire = typeDeMemoire;
    }

    public Boolean getControleurGraphiqueIntegre() {
        return controleurGraphiqueIntegre;
    }

    public void setControleurGraphiqueIntegre(Boolean controleurGraphiqueIntegre) {
        this.controleurGraphiqueIntegre = controleurGraphiqueIntegre;
    }

    public Boolean getGpuInCpu() {
        return gpuInCpu;
    }

    public void setGpuInCpu(Boolean gpuInCpu) {
        this.gpuInCpu = gpuInCpu;
    }

    public String getChipsetGraphique() {
        return chipsetGraphique;
    }

    public void setChipsetGraphique(String chipsetGraphique) {
        this.chipsetGraphique = chipsetGraphique;
    }

    public Integer getTailleMemoireVideo() {
        return tailleMemoireVideo;
    }

    public void setTailleMemoireVideo(Integer tailleMemoireVideo) {
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

    public Boolean getPci() {
        return pci;
    }

    public void setPci(Boolean pci) {
        this.pci = pci;
    }

    public Boolean getPciExpress1x20() {
        return pciExpress1x20;
    }

    public void setPciExpress1x20(Boolean pciExpress1x20) {
        this.pciExpress1x20 = pciExpress1x20;
    }

    public Boolean getPciExpress16x20() {
        return pciExpress16x20;
    }

    public void setPciExpress16x20(Boolean pciExpress16x20) {
        this.pciExpress16x20 = pciExpress16x20;
    }

    public Boolean getPciExpress1x30() {
        return pciExpress1x30;
    }

    public void setPciExpress1x30(Boolean pciExpress1x30) {
        this.pciExpress1x30 = pciExpress1x30;
    }

    public Boolean getPciExpress16x30() {
        return pciExpress16x30;
    }

    public void setPciExpress16x30(Boolean pciExpress16x30) {
        this.pciExpress16x30 = pciExpress16x30;
    }

    public Integer getPciNum() {
        return pciNum;
    }

    public void setPciNum(Integer pciNum) {
        this.pciNum = pciNum;
    }

    public Integer getPciExpress1x20Num() {
        return pciExpress1x20Num;
    }

    public void setPciExpress1x20Num(Integer pciExpress1x20Num) {
        this.pciExpress1x20Num = pciExpress1x20Num;
    }

    public Integer getPciExpress16x20Num() {
        return pciExpress16x20Num;
    }

    public void setPciExpress16x20Num(Integer pciExpress16x20Num) {
        this.pciExpress16x20Num = pciExpress16x20Num;
    }

    public Integer getPciExpress1x30Num() {
        return pciExpress1x30Num;
    }

    public void setPciExpress1x30Num(Integer pciExpress1x30Num) {
        this.pciExpress1x30Num = pciExpress1x30Num;
    }

    public Integer getPciExpress16x30Num() {
        return pciExpress16x30Num;
    }

    public void setPciExpress16x30Num(Integer pciExpress16x30Num) {
        this.pciExpress16x30Num = pciExpress16x30Num;
    }

    public String getChipsetAudio() {
        return chipsetAudio;
    }

    public void setChipsetAudio(String chipsetAudio) {
        this.chipsetAudio = chipsetAudio;
    }

    public Integer getNombreCanauxAudio() {
        return nombreCanauxAudio;
    }

    public void setNombreCanauxAudio(Integer nombreCanauxAudio) {
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

    public Boolean getRaid() {
        return raid;
    }

    public void setRaid(Boolean raid) {
        this.raid = raid;
    }

    public String getConnecteurDisque() {
        return connecteurDisque;
    }

    public void setConnecteurDisque(String connecteurDisque) {
        this.connecteurDisque = connecteurDisque;
    }

    public Integer getModeRaid() {
        return modeRaid;
    }

    public void setModeRaid(Integer modeRaid) {
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
