package za.ac.cput.service.service;
/**
 * Mpho Sefoloko
 * 218336322
 */

import za.ac.cput.domain.Address;
import java.util.List;
import java.util.Optional;

public interface AddressService extends IService<Address,Address.AddressId> {
    List<Address> findAll();
    //void deleteById(String id);
    List<Address>findByUnitNumber(String unitNumber);
}



