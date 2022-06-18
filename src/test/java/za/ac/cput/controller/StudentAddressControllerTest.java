package za.ac.cput.controller;

/*
Nawaaz Amien
219099839
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.StudentAddress;
import za.ac.cput.factory.StudentAddressFactory;

import java.util.Arrays;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentAddressControllerTest {
    @LocalServerPort
    private int port;
    @Autowired private StudentAddressController controller;
    @Autowired private TestRestTemplate restTemplate;
    private StudentAddress studentAddress;
    private String baseUrl;

    @BeforeEach
    void setUp()
    {
        this.studentAddress= StudentAddressFactory.build("Student-Address-test-id");
        this.baseUrl="http://localhost:"+ this.port + "/schoolmanagement/student-address/";
    }
    @Test
    @Order(1)
    void save()
    {
        String url=baseUrl+ "save";
        System.out.println(url);
        ResponseEntity<StudentAddress> response=this.restTemplate
                .postForEntity(url,this.studentAddress,StudentAddress.class);
        System.out.println(response);
        assertAll(
                ()->assertEquals(HttpStatus.OK,response.getStatusCode()),
                ()->assertNotNull(response.getBody())
        );
    }
    @Test
    @Order(2)
    void read()
    {
        String url=baseUrl +"read/" + this.studentAddress.getStudentId();
        System.out.println(url);
        ResponseEntity<StudentAddress>response=this.restTemplate.getForEntity(url,StudentAddress.class);
        System.out.println(response);
        assertAll(
                ()->assertEquals(HttpStatus.OK,response.getStatusCode()),
                ()->assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(4)
    void delete()
    {
        String url=baseUrl + "delete/" + this.studentAddress.getStudentId();
        this.restTemplate.delete(url,controller.delete(studentAddress));
    }
    @Test
    @Order(3)
    void findAll()
    {
        String url=baseUrl +"all";
        System.out.println(url);
        ResponseEntity<StudentAddress[]> response=this.restTemplate.getForEntity(url,StudentAddress[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                ()->assertEquals(HttpStatus.OK,response.getStatusCode()),
                ()->assertTrue(response.getBody().length==1)
        );
    }
}