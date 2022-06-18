package za.ac.cput.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Country;
import za.ac.cput.factory.CountryFactory;
import za.ac.cput.service.service.CountryService;

@SpringBootTest
class CountryAPITest {
    @Autowired
    private CountryService countryService;
    @Autowired private  CountryAPI api;

    private Country country= CountryFactory
            .build("Country-test-id-16","South Africa");
    @Test
    void save(){Country save=this.api.save(this.country);}
}
