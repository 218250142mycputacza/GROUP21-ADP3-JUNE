package za.ac.cput.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.service.service.EmployeeService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
/*Warren Jaftha-219005303*/
@SpringBootTest
class EmployeeAPITest {
    @Autowired private EmployeeService employeeService;
    @Autowired private  EmployeeAPI api;

    private Employee employee= EmployeeFactory
            .build("test-id42","warrenjaftha16@gmail.com");
    @Test
    void save(){Employee save=this.api.save(this.employee);}

  /*  @Test
    void read(){
        Optional<Employee> read=this.api.read();}*/
}