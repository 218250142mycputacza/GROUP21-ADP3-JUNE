package za.ac.cput.controller;

/*
Nawaaz Amien
219099839
 */

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.StudentFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class StudentControllerTest {
    @LocalServerPort
    private int port;
    @Autowired private StudentController studentcontroller;
    @Autowired private TestRestTemplate restTemplate;
    private Student student;
    private String baseUrl;

    @BeforeEach
    void setUp()
    {
        this.student= StudentFactory.build("Student-test-id-219099839","nawaazamien9@gmail.com");
        this.baseUrl="http://localhost:" + this.port + "/schoolmanagement/student/";
    }
    @Test
    @Order(1)
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<Student> response = this.restTemplate
                .postForEntity(url, this.student, Student.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())

        );
    }}
    /*
@Test
    @Order(3)
    void delete()
    {
        String url=baseUrl + "delete/" + this.student.getStudentId();
        this.restTemplate.delete(url,controller.delete(student));

    }
    @Test
    @Order(2)
    void read() {
    String url=baseUrl + "read/" + this.student.getStudentId();
    System.out.println(url);
    ResponseEntity<Student>response=
            this.restTemplate.getForEntity(url,Student.class);
    System.out.println(response);
    assertAll(
            ()->assertEquals(HttpStatus.OK,response.getStatusCode()),
            ()->assertNotNull(response.getBody())
    );

}


@Test
    @Order(4)
    void findAll()
{
    String url=baseUrl +"all";
    System.out.println(url);
    ResponseEntity<Student[]>response=
            this.restTemplate.getForEntity(url,Student[].class);
    System.out.println(Arrays.asList(response.getBody()));
    assertAll(
            ()->assertEquals(HttpStatus.OK,response.getStatusCode()),
            ()->assertTrue(response.getBody().length==0)
    );
}
}*/
