package za.ac.cput.factory;

/*
Nawaaz Amien
219099839
 */

import za.ac.cput.domain.StudentAddress;

public class StudentAddressFactory {
    public static StudentAddress build(String studentId)
    {
        if(studentId==null || studentId.isEmpty())
            throw new IllegalArgumentException("Student Id is required!");
        return new StudentAddress.Builder().studentId(studentId)
                .build();
    }
    public static StudentAddress.StudentAddressId buildId(StudentAddress studentAddress)
    {
        return new StudentAddress.StudentAddressId(studentAddress.getStudentId());
    }
}

