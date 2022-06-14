package za.ac.cput.repository;

/*
Nawaaz Amien
219099839
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.StudentAddress;

import java.util.List;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress,StudentAddress.StudentAddressId> {
    List<StudentAddress> findAll();
    List<StudentAddress>findByStudentId(String studentId);

}

