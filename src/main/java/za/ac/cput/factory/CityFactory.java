package za.ac.cput.factory;
/**
 * Aristoteles 218290276
 * City Factory
 * 12.06.2022
 */
import za.ac.cput.domain.City;


public class CityFactory {
    public static City build(String id, String name)
    {
        if(id ==null ||id.isEmpty() )
            throw new IllegalArgumentException("City Id is required!");
        if( name ==null||name.isEmpty() )
            throw new IllegalArgumentException("Name is required!");
        return new City.Builder().id(id)
                .name(name).build();

    }
    public static City.CityId buildId(City city)
    {
        return new City.CityId(city.getId());
    }

}



