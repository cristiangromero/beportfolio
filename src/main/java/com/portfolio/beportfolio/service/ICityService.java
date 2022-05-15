
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.City;
import java.util.List;


public interface ICityService {
    public List<City> listCity();
    public City findCity (int id); 
}
