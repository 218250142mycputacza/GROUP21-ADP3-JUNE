package za.ac.cput.service.service;

/*
Nawaaz Amien
219099839
 */

import za.ac.cput.domain.StudentAddress;
import za.ac.cput.service.IService;

import java.util.List;

public interface StudentAddressService extends IService<StudentAddress,StudentAddress.StudentAddressId> {
    List<StudentAddress> findAll();
    //void deleteById(String id);
    List<StudentAddress> findByStudentId(String studentId);
}
