package za.ac.cput.service.impl;

/*
Nawaaz Amien
219099839
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.service.service.StudentService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentServiceImplTest {
    private final Student student= StudentFactory
            .build("Student-Id", "nawaazamien9@gmail.com");
    private Student.StudentId studentId=StudentFactory.buildId(this.student);
    @Autowired
    private StudentService service;

    @Test
    @Order(1)
    void save()
    {
        Student saved=this.service.save(this.student);
        assertAll(
                ()->assertNotNull(saved),
                ()->assertEquals(this.student,saved)
        );
    }
    @Test
    @Order(4)
    void tearDown(){this.service.delete(this.student);}

    @Test
    @Order(2)
    void read()
    {
        Optional<Student> read=this.service.read(this.studentId);
        System.out.println(read);
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()->assertEquals(this.student,read.get())
        );
    }
    @Test
    @Order(5)
    void findAll()
    {
        List<Student> studentList=this.service.findAll();
        assertEquals(0,studentList.size());
    }
    @Test
    @Order(3)
    void findByStudentId()
    {
        String studentId=this.studentId.getStudentId();
        List<Student>studentList=this.service.findByStudentId(studentId);
        System.out.println(studentList);
        assertSame(1,studentList.size());
    }
}