package za.ac.cput.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Name;
import za.ac.cput.factory.NameFactory;
import za.ac.cput.service.service.NameService;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NameAPITest {
    @Autowired private NameService nameService;
    @Autowired private  NameAPI api;

    private Name name= NameFactory.build("Zelino","none","Pestana");

    @Test
    void save(){Name save=this.api.save(this.name);}

}
