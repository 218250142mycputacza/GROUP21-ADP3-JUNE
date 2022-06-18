package za.ac.cput.api;
/**
 * Aristoteles 218290276
 * City API Test
 * 18/06/2022
 *
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.City;
import za.ac.cput.factory.CityFactory;
import za.ac.cput.service.service.CityService;


import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class CityAPITest {
    @Autowired private CityService cityService;
    @Autowired private CityAPI api;

    private City city= CityFactory.build("Test-Id","Cape Town");

    @Test
    void save(){City save=this.api.save(this.city);}
}


}