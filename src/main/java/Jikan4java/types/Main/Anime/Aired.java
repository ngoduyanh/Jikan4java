package Jikan4java.types.Main.Anime;
/*
This file is part of Jikan4java.

Jikan4java is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Foobar is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
*/
import Jikan4java.types.Support.Prop.Prop;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Aired {
    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    @JsonProperty("prop")
    private Prop prop;

    @JsonProperty("string")
    private String string;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Prop getProp() {
        return prop;
    }
}