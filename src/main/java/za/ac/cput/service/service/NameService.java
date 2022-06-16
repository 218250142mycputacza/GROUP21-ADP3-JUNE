package za.ac.cput.service.service;

import za.ac.cput.domain.Name;

import java.util.List;

public interface NameService extends IService<Name,Name.NameId> {
    List<Name> findAll();
    List<Name> findByFirstName(String firstName);
}

