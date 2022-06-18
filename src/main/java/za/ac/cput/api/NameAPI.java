package za.ac.cput.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.domain.Name;
import za.ac.cput.service.service.NameService;

@Component
public class NameAPI {
    private final NameService nameService;
    @Autowired public NameAPI(NameService nameService)
    {
        this.nameService=nameService;
    }
    public Name save(Name name){return this.nameService.save(name);}
}

