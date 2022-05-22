
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
    public City findCity(int id) {
       return cityRepo.findById(id).orElse(null);
    }
    
}
