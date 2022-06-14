package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.EmployeeAddress;

import java.util.List;
/*Warren jaftha-219005303*/
@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress,EmployeeAddress.EmployeeAddressId> {
    List<EmployeeAddress> findAll();
    List<EmployeeAddress>findByStaffId(String staffId);

}