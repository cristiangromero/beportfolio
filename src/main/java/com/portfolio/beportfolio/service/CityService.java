
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.City;
import com.portfolio.beportfolio.repository.CityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


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
    public void deleteCity(int id) {
       cityRepo.deleteById(id);
    }

    @Override
    public City findCity(int id) {
       return cityRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editCity(City city) {
        cityRepo.save(city);
    }
    
}
