
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.City;
import com.portfolio.beportfolio.repository.CityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService{
    
    @Autowired
    public CityRepository cityRepo;
    
    @Override
    public List<City> listCity() {
        return cityRepo.findAll();
    }

    @Override
    public void newCity(City city) {
        cityRepo.save(city);
    }
    
    @Override
    public void deleteCity(City city) {
       cityRepo.delete(city);
    }

    @Override
    public City findCity(Long id) {
       return cityRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editCity(City city) {
        cityRepo.save(city);
    }
}
