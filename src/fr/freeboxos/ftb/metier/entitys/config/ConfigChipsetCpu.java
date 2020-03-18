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
package fr.freeboxos.ftb.metier.entitys.config;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
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
public class ConfigChipsetCpu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String chipsetCpu;

    public ConfigChipsetCpu() {
    }

    public ConfigChipsetCpu(String chipsetCpu) {
        this.chipsetCpu = chipsetCpu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChipsetCpu() {
        return chipsetCpu;
    }

    public void setChipsetCpu(String chipsetCpu) {
        this.chipsetCpu = chipsetCpu;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 53 * hash + Objects.hashCode(this.chipsetCpu);
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
        final ConfigChipsetCpu other = (ConfigChipsetCpu) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.chipsetCpu, other.chipsetCpu);
    }

    @Override
    public String toString() {
        return chipsetCpu;
    }

}
