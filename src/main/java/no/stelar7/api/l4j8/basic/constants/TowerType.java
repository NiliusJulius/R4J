package no.stelar7.api.l4j8.basic.constants;

import java.util.*;
import java.util.stream.*;

public enum TowerType
{
    BASE_TURRET,
    FOUNTAIN_TURRET,
    INNER_TURRET,
    NEXUS_TURRET,
    OUTER_TURRET,
    UNDEFINED_TURRET;
    
    /**
     * Returns an TowerType from the provided code
     *
     * @return TowerType
     */
    public static Optional<TowerType> getFromCode(final String type)
    {
        return Stream.of(TowerType.values()).filter(t -> t.name().equalsIgnoreCase(type)).findFirst();
    }
    
    /**
     * The code used to map strings to objects
     *
     * @return String
     */
    public String getCode()
    {
        return this.name();
    }
}
