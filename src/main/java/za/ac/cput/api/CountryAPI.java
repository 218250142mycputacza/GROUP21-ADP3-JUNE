package za.ac.cput.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.domain.Country;
import za.ac.cput.service.service.CountryService;

@Component
public class CountryAPI {
    private final CountryService countryService;

    @Autowired public CountryAPI(CountryService countryService)
    {
        this.countryService=countryService;
    }
    public Country save(Country country)
    {
        return this.countryService.save(country);
    }
}

