package za.ac.cput.service.service;

/**
 * City Service
 * Aristoteles 218290276
 * 15/062022
 */
import za.ac.cput.domain.City;
import java.util.List;
import za.ac.cput.service.IService;
public interface CityService extends IService<City,City.CityId> {
    List<City> findAll();
    //void deleteById(String id);
    List<City> findById(String id);
}


