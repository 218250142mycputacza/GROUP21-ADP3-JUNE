//Name: Levi Williams
// Student number: 218250142
package za.ac.cput.factory;

import za.ac.cput.entity.Country;

public class CountryFactory {
    public static Country createCountry(String id, String name){
        return new Country.Builder()
                .setId(id)
                .setName(name)
                .build();
    }
}
