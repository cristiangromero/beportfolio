package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Country;
import com.portfolio.beportfolio.repository.CountryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService{
    
    @Autowired
    public CountryRepository countryRepo;
    
    @Override
    public List<Country> listCountry() {
        return countryRepo.findAll();
    }

    @Override
    public void newCountry(Country country) {
        countryRepo.save(country);
    }
    
    @Override
    public void deleteCountry(Country country) {
       countryRepo.delete(country);
    }

    @Override
    public Country findCountry(Long id) {
       return countryRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editCountry(Country country) {
        countryRepo.save(country);
    }
}
