package za.ac.cput.api;
/**
 * Aristoteles 218290276
 * City API
 * 18/06/2022
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.domain.City;
import za.ac.cput.service.service.CityService;

@Component

public class CityAPI {
    private final CityService cityService;
    @Autowired public CityAPI(CityService cityService)
    {
        this.cityService=cityService;
    }
    public City save(City city){return this.cityService.save(city);}
}

}
