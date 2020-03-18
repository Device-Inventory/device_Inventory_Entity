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
public class ConfigMarqueCpu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String marqueCpu;

    public ConfigMarqueCpu() {
    }

    public ConfigMarqueCpu(String marqueCpu) {
        this.marqueCpu = marqueCpu;
    }

    public String getMarqueCpu() {
        return marqueCpu;
    }

    public void setMarqueCpu(String marqueCpu) {
        this.marqueCpu = marqueCpu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 53 * hash + Objects.hashCode(this.marqueCpu);
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
        final ConfigMarqueCpu other = (ConfigMarqueCpu) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.marqueCpu, other.marqueCpu);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return marqueCpu;
    }

}
