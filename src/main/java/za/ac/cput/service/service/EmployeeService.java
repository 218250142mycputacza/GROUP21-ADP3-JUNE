package za.ac.cput.service.service;

import za.ac.cput.domain.Employee;
import za.ac.cput.service.IService;

import java.util.List;

public interface EmployeeService extends IService<Employee,Employee.EmployeeId> {
    List<Employee> findAll();
    //void deleteById(String id);
    List<Employee>findByStaffId(String staffId);

}