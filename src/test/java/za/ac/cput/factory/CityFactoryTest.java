package za.ac.cput.factory;
/**
 * Aristoteles 218290276
 * City Factory Test
 * 12.06.2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.City;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {
    @Test
    public void buildWithSuccess()
    {
        City city=CityFactory
                .build("Test-Id","Cape Town");
        System.out.println(city);
        assertNotNull(city);
    }
    @Test
    void buildWithError()
    {
        Exception exception=assertThrows(IllegalArgumentException.class,()-> CityFactory.build(null, "Cape Town"));
        String exceptionMessage=exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("City ID is required!",exceptionMessage);
    }



}
