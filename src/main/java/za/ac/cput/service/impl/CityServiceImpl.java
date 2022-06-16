package za.ac.cput.service.impl;
/**
 * Aristoteles 218290276
 * City Service Implements Test
 * 15/06/2022
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.City;
import za.ac.cput.repository.CityRepository;
import za.ac.cput.service.service.CityService;

import java.util.List;
import java.util.Optional;
@Service


public class CityServiceImpl implements CityService{
    private final CityRepository repository;

    @Autowired
    public CityServiceImpl(CityRepository repository)
    {
        this.repository=repository;
    }
    @Override
    public City save(City city)
    {
        return this.repository.save(city);
    }
    @Override
    public Optional<City> read(City.CityId cityId){return this.repository.findById(cityId);}


    @Override
    public void delete(City city){this.repository.delete(city);}



    @Override
    public List<City> findAll(){return this.repository.findAll();}




    @Override
    public List findById(String id)
    {
        return this.repository.findById(id);
    }
}




