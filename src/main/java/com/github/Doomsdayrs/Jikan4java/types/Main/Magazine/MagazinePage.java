package com.github.Doomsdayrs.Jikan4java.types.Main.Magazine;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.Doomsdayrs.Jikan4java.types.Support.Basic.BasicMeta;

import java.util.ArrayList;

/**
 * This file is part of Jikan4java.
 * Jikan4java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
 * ====================================================================
 * Jikan4java
 * 04 / November / 2018
 *
 * @author github.com/doomsdayrs
 */

public class MagazinePage {
    @JsonProperty("request_hash")
    private String request_hash;
    @JsonProperty("request_cached")
    private boolean request_cached;
    @JsonProperty("request_cache_expiry")
    private int request_cache_expiry;
    @JsonProperty("meta")
    private BasicMeta meta;
    @JsonProperty("manga")
    private ArrayList<Magazine> magazines;

    /**
     * Gets request hash
     *
     * @return Request hash
     */
    public String getRequest_hash() {
        return request_hash;
    }

    /**
     * Is the request cached?
     * @return is it cached?
     */
    public boolean isRequest_cached() {
        return request_cached;
    }

    /**
     * Gets expiry
     * @return int date or something
     */
    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    /**
     * Get meta
     * @return meta
     */
    public BasicMeta getMeta() {
        return meta;
    }

    /**
     * Get magazines
     * @return magazines
     */
    public ArrayList<Magazine> getMagazines() {
        return magazines;
    }

    @Override
    public String toString() {
        return "MagazinePage{" +
                "request_hash='" + request_hash + '\'' +
                ", request_cached=" + request_cached +
                ", request_cache_expiry=" + request_cache_expiry +
                ", meta=" + meta +
                ", magazines=" + magazines +
                '}';
    }
}
