package za.ac.cput.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Name;
import za.ac.cput.factory.NameFactory;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class NameControllerTest {
    @LocalServerPort
    private int port;
    @Autowired private NameController controller;
    @Autowired private TestRestTemplate restTemplate;
    private Name name;
    private String baseUrl;

    @BeforeEach
    void setUp()
    {
        this.name= NameFactory.build("Zelino","none","Pestana");
        this.baseUrl="http://localhost:" +this.port+"/schoolmanagement/name/";

    }
    @Test
    @Order(1)
    void save()
    {
        String url=baseUrl+ "save";
        System.out.println(url);
        ResponseEntity<Name>response=this.restTemplate
                .postForEntity(url,this.name,Name.class);
        System.out.println(response);
        assertAll(
                ()->assertEquals(HttpStatus.OK,response.getStatusCode()),
                ()->assertNotNull(response.getBody())
        );
    }}
