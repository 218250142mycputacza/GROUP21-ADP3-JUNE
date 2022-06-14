/**
 * Aristoteles 218290276
 * CityRepository
 * 14/06/2022
 */
package za.ac.cput.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.City;
import java.util.List;

public interface CityRepository extends JpaRepository<City,City.CityId> {
    List<City> findAll();
    List<City> findById(String id);
}




