package za.ac.cput.controller;
/**
 * Aristoteles 218290276
 * City Controller Test
 * 18/06/2022
 *
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.City;
import za.ac.cput.factory.CityFactory;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)



class CityControllerTest {
    @LocalServerPort
    private int port;
    @Autowired private CityController cityController;
    @Autowired private TestRestTemplate restTemplate;
    private City city;
    private String baseUrl;

    @BeforeEach
    void setUp()
    {
        this.city= CityFactory.build("student-id-1","nawaazamien9@gmail.com");
        this.baseUrl="http://localhost:" + this.port + "/schoolmanagement/city/";
    }
    @Test
    @Order(1)
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<City> response = this.restTemplate
                .postForEntity(url, this.city, City.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())

        );
    }}


}