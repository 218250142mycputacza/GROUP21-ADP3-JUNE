package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.api.EmployeeAPI;
import za.ac.cput.domain.Employee;
import za.ac.cput.service.service.EmployeeService;

import javax.validation.Valid;
import java.util.List;
/*Warren Jaftha-219005303*/
@RestController
@RequestMapping("schoolmanagement/employee/")
@Slf4j
public class EmployeeController {
    private final EmployeeAPI api;
    @Autowired
    public EmployeeController(EmployeeAPI api)
    {
        this.api=api;

    }

    @PostMapping("save")
    public ResponseEntity<Employee> save(@Valid @RequestBody Employee employee) {
        // log.info("save request:{}", employee);
        Employee save = this.api.save(employee);
        return ResponseEntity.ok(save);
    }}

/*   @GetMapping("read/{employeeId}")
    public ResponseEntity<Employee> read(@PathVariable Employee.EmployeeId employeeId)
    {
        log.info("Read request:{}",employeeId);
        Employee employee=this.api.read(employeeId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(employee);
    }}
    @DeleteMapping("delete/{employeeId}")
    public ResponseEntity<Employee>delete(@PathVariable Employee employee)
    {
        log.info("Read request:{}",employee);
        this.employeeService.delete(employee);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("all")
    public ResponseEntity<List<Employee>>findAll()
    {
        List<Employee>employeeList=this.employeeService.findAll();
        return ResponseEntity.ok(employeeList);
    }
}*/
