package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.service.service.EmployeeService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
/*Warren Jaftha-219005303*/
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeServiceImplTest {
    private final Employee employee= EmployeeFactory.build("test-staff-id","warrenjaftha16@gmail.com");

    private Employee.EmployeeId employeeId=EmployeeFactory.buildId(this.employee);
    @Autowired
    private EmployeeService service;

    @Test
    @Order(1)
    void save()
    {
        Employee saved=this.service.save(this.employee);
        assertAll(
                ()->assertNotNull(saved),
                ()->assertEquals(this.employee,saved)
        );
    }
    @Test
    @Order(4)
    void delete(){this.service.delete(this.employee);}

    @Test
    @Order(2)
    void read()
    {
        Optional<Employee> read=this.service.read(this.employeeId);
        System.out.println(read);
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()->assertEquals(this.employee,read.get())
        );
    }
    @Test
    @Order(5)
    void findAll()
    {
        List<Employee> employeeList=this.service.findAll();
        assertEquals(0,employeeList.size());
    }
    @Test
    @Order(3)
    void findByStaffId()
    {
        String staffId=this.employeeId.getStaffId();
        List<Employee>employeeList=this.service.findByStaffId(staffId);
        System.out.println(employeeList);
        assertSame(1,employeeList.size());
    }
}