package za.ac.cput.repository;

/*
Nawaaz Amien
219099839
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Student.StudentId> {
    List<Student> findAll();
    List<Student>findByStudentId(String studentId);
}

