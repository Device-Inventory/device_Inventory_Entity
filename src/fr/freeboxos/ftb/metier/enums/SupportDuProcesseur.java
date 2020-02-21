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
package fr.freeboxos.ftb.metier.enums;

/**
 *
 * @author alan
 */
public enum SupportDuProcesseur {
    amdam3("AMD AM3"), admam3plus("AMD AM3+"), amdam4("AMD AM4"), amdfm2plus("AMD FM2+"),
    amdsp3("AMD SP3"), amdstr4("AMD sTR4"), amdstrx4("AMD sTRx4"), intel1150("Intel 1150"),
    intel1151("Intel 1151"), intel2011v3("Intel 2011-v3"), Intel2066("Intel 2066"),
    intellga3647("Intel LGA3647"), na("N/A");

    private String supportProcesseur;

    public String getSupportProcesseur() {
        return supportProcesseur;
    }

    private SupportDuProcesseur(String supportProcesseur) {
        this.supportProcesseur = supportProcesseur;
    }

}
