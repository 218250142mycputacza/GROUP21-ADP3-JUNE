package za.ac.cput.api;

/*
Nawaaz Amien
219099839
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.domain.Student;
import za.ac.cput.service.service.StudentService;

@Component
public class StudentAPI {
    private final StudentService studentService;

    @Autowired public StudentAPI(StudentService studentService)
    {
        this.studentService=studentService;
    }
    public Student save(Student student)
    {
        return this.studentService.save(student);
    }
}
