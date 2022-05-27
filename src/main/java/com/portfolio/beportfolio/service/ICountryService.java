package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Country;
import java.util.List;

public interface ICountryService {
    public List<Country> listCountry();
    public void newCountry(Country country);
    public void deleteCountry(int id);
    public Country findCountry(int id);
    public void editCountry(Country country);
}
