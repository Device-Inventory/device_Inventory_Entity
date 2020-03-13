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
package fr.freeboxos.ftb.metier.sort.config;

import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueHdd;
import java.util.Comparator;

/**
 *
 * @author alan
 */
public class ComparatorByIdConfigMarqueHdd implements Comparator<ConfigMarqueHdd> {

    @Override
    public int compare(ConfigMarqueHdd t, ConfigMarqueHdd t1) {
        return (int) (t.getId() - t1.getId());
    }

}
