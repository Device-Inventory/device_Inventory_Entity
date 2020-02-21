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
public enum formatCarteMere {

    atx("ATX"), eatx("E-ATX"), microatx("Micro ATX"), minidtx("Mini DTX"), miniitx("Mini ITX"), ssiceb("SSI CEB"), xlatx("XL-ATX");

    private String format;

    public String getFormat() {
        return format;
    }

    private formatCarteMere(String format) {
        this.format = format;
    }

}
