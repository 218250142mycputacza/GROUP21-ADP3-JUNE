package ac.za.cput.factory;

import ac.za.cput.domain.Name;
import org.junit.jupiter.api.Test;
//import util.Help;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {


    @Test
    public void test(){
        Name name = NameFactory.createName("Zelino", "Sancho", "Pestana");
        System.out.println(name.toString());
        assertNotNull(name);
    }

}