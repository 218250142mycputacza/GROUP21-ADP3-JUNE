package za.ac.cput.factory;

/*
Nawaaz Amien
219099839
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StudentAddress;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressFactoryTest {
    @Test
    public void buildWithSuccess()
    {
        StudentAddress studentAddress=StudentAddressFactory
                .build("Student-Id");
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }
    @Test
    void buildWithError()
    {
        Exception exception=assertThrows(IllegalArgumentException.class,()-> StudentAddressFactory.build(null));
        String exceptionMessage=exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Student ID is required!",exceptionMessage);
    }

}
