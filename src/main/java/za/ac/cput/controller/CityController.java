package za.ac.cput.controller;
/**
 * Aristoteles 218290276
 * City Controller
 * 18/06/2022
 *
 */
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.api.CityAPI;
import za.ac.cput.domain.City;
import za.ac.cput.service.service.CityService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("schoolmanagement/city/")
@Slf4j

public class CityController {
    private final CityAPI api;

    @Autowired
    public CityController(CityAPI api) {
        this.api = api;
    }

    @PostMapping("save")
    public ResponseEntity<City> save(@Valid @RequestBody City city) {
        log.info("save request:{}", city);
        City save = this.api.save(city);
        return ResponseEntity.ok(save);
    }

}
