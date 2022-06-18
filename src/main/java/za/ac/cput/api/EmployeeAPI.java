package za.ac.cput.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.domain.Employee;
import za.ac.cput.service.service.EmployeeAddressService;
import za.ac.cput.service.service.EmployeeService;

import java.util.Optional;
/*Warren Jaftha-219005303*/
@Component
public class EmployeeAPI {
    private final EmployeeService employeeService;

    @Autowired public EmployeeAPI(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    public Employee save(Employee employee)
    {
        return this.employeeService.save(employee);
    }

    //  public Optional<Employee> read(Employee.EmployeeId employeeId){return this.employeeService.read(employeeId);}
}
