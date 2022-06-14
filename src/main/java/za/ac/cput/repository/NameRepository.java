package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Name;

import java.util.List;

@Repository
public interface NameRepository extends JpaRepository<Name,Name.NameId> {
    List<Name> findAll();
    List<Name>findByFirstName(String firstName);
}

