package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Country;
import java.util.List;

public interface ICountryService {
    public List<Country> listCountry();
    public Country findCountry (int id);
}
