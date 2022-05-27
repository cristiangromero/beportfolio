package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Country;
import java.util.List;

public interface ICountryService {
    public List<Country> listCountry();
    public void newCountry(Country country);
    public void deleteCountry(Country country);
    public Country findCountry(Long id);
    public void editCountry(Country country);
}
