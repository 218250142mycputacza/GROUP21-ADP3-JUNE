package za.ac.cput.api;

/*
Nawaaz Amien
219099839
 */

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.service.service.StudentService;

@SpringBootTest
class StudentAPITest {
    @Autowired
    private StudentService studentService;
    @Autowired private  StudentAPI api;

    private Student student= StudentFactory
            .build("Student-test-id-219099839","nawaazamien9@gmail.com");
    @Test
    void save(){Student save=this.api.save(this.student);}
}