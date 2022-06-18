package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.api.NameAPI;
import za.ac.cput.domain.Name;
import za.ac.cput.service.service.NameService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("schoolmanagement/name/")
@Slf4j
public class NameController {
    //  private final NameService nameService;
    private final NameAPI api;

    @Autowired public NameController(NameAPI api)
    {
        this.api=api;
    }
    @PostMapping("save")
    public ResponseEntity<Name>save(@Valid @RequestBody Name name)
    {
        //log.info("save request:{}",name);
        Name save=this.api.save(name);
        return ResponseEntity.ok(save);
    }}

