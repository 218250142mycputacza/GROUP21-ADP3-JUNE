package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Name;
import za.ac.cput.factory.NameFactory;
import za.ac.cput.service.service.NameService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class NameServiceImplTest {

    private final Name name= NameFactory.build("Zelino","none","Pestana");
    private Name.NameId nameId=NameFactory.buildId(this.name);

    @Autowired
    private NameService service;

    @Test
    @Order(1)
    void save()
    {
        Name saved=this.service.save(this.name);
        assertAll(
                ()->assertNotNull(saved),
                ()->assertEquals(this.name,saved)
        );
    }
    @Test
    @Order(4)
    void tearDown(){this.service.delete(this.name);}
    @Test
    @Order(2)
    void read()
    {
        Optional<Name> read=this.service.read(this.nameId);
        System.out.println(read);
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()->assertEquals(this.name,read.get())
        );
    }
    @Test
    @Order(5)
    void findAll()
    {
        List<Name> nameList=this.service.findAll();
        assertEquals(0,nameList.size());
    }
    @Test
    @Order(3)
    void findByFirstName()
    {
        String firstName=this.nameId.getFirstName();
        List<Name>nameList=this.service.findByFirstName(firstName);
        System.out.println(nameList);
        assertSame(1,nameList.size());
    }
}
