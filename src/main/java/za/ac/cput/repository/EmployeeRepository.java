package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Employee;

import java.util.List;

/*Warren Jaftha-219005303*/
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Employee.EmployeeId> {
    List<Employee> findAll();
    List<Employee>findByStaffId(String staffId);
}
