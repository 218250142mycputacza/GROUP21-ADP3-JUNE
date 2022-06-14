//Name: Levi Williams
// Student Number: 218250142
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Country;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,Country.CountryIdentity> {
    List<Country> findAll();
    List<Country> findByCountryId(String countryId);
}
