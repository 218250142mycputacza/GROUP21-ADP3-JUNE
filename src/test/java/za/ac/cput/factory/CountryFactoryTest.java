//Name: Levi Williams
// Student number: 218250142
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Country;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {
    @Test
    public void test() {
        Country country = CountryFactory.createCountry("", "");
        System.out.println(country);
        assertNotNull(country);
    }
}