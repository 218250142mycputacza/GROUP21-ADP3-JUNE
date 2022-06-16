//Name: Levi Williams
// Student Number: 218250142
package za.ac.cput.service.service;

import za.ac.cput.domain.Country;
import za.ac.cput.service.IService;

import java.util.List;

public interface CountryService extends IService<Country,Country.CountryIdentity> {
    List<Country> findAll();
    //void deleteById(String id);
    List<Country> findByCountryId(String countryId);
}
