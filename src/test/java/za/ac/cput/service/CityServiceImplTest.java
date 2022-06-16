package za.ac.cput.service;

/**
 * Aristoteles 218290276
 * City Service Implements Test
 * 15/06/2022
 *
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.City;
import za.ac.cput.factory.CityFactory;
import za.ac.cput.service.service.CityService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class CityServiceImplTest {
  private final City city= CityFactory
            .build("test-Id", "Los santos");
    private City.CityId cityId=CityFactory.buildId(this.city);
    @Autowired
    private CityService service;

    @Test
    @Order(1)
    void save()
    {
        City saved=this.service.save(this.city);
        assertAll(
                ()->assertNotNull(saved),
                ()->assertEquals(this.city,saved)
        );
    }
    @Test
    @Order(4)
    void tearDown(){this.service.delete(this.city);}

    @Test
    @Order(2)
    void read()
    {
        Optional<City> read=this.service.read(this.cityId);
        System.out.println(read);
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()->assertEquals(this.city,read.get())
        );
    }
    @Test
    @Order(5)
    void findAll()
    {
        List<City> cityList=this.service.findAll();
        assertEquals(0,cityList.size());
    }
    @Test
    @Order(3)
    void findById()
    {
        String id=this.cityId.getId();
        List<City>cityList=this.service.findById(id);
        System.out.println(cityList);
        assertSame(1,cityList.size());
    }
}


