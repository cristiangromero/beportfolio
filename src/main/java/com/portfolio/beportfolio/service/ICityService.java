
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.City;
import java.util.List;


public interface ICityService {
    public List<City> listCity();
    public void newCity(City city);
    public void deleteCity(City city);
    public City findCity(Long id);
    public void editCity(City city);
}
