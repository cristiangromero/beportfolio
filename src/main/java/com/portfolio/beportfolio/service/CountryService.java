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
    public Country findCountry(int id) {
        return countryRepo.findById(id).orElse(null);
    }

}
