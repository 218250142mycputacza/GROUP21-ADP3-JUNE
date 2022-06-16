package za.ac.cput.service.service;


import za.ac.cput.domain.Student;

import java.util.List;

public interface StudentService extends IService<Student,Student.StudentId> {
    List<Student> findAll();
    //void deleteById(String id);
    List<Student> findByStudentId(String studentId);
}
