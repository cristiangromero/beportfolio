package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.City;
import com.portfolio.beportfolio.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CityController {
    @Autowired
    private ICityService cityServ;    
    
    @PostMapping("/api/city")
    public void addCity (@RequestBody City city){
        cityServ.newCity(city);
    }
    @GetMapping("/api/city")
    @ResponseBody
    public List<City> listCity(){
        return cityServ.listCity();
    }
   
    @GetMapping("/api/city/{id}")
    @ResponseBody
    public City findCity(@PathVariable Long id){
        return cityServ.findCity(id);
    }
    
    @DeleteMapping("/api/city/{id}")
    public void deleteCity (@PathVariable Long id){
        City city= findCity(id);
        cityServ.deleteCity(city);
    }
    
    @PutMapping("/api/city")
    public void editCity (@RequestBody City city){
        cityServ.editCity(city);
    }
    
    @PutMapping("/api/city/{id}")
    public void editCity(@PathVariable Long id) {
        City city= findCity(id);
        cityServ.editCity(city);
    }
}
