package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.City;
import com.portfolio.beportfolio.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    private ICityService cityServ;    
    
    @PostMapping("/new/city")
    public void addCity (@RequestBody City city){
        cityServ.newCity(city);
    }
    @GetMapping("/list/city")
    @ResponseBody
    public List<City> listCity(){
        return cityServ.listCity();
    }
   
    @GetMapping("/findcity/{id}")
    @ResponseBody
    public City findCity(@PathVariable Integer id){
        return cityServ.findCity(id);
    }
    
    @DeleteMapping("/deletecity/{id}")
    public void deleteCity (@PathVariable Integer id){
        cityServ.deleteCity(id);
    }
    
    @PutMapping("/edit/city")
    public void editCity (@RequestBody City city){
        cityServ.editCity(city);
    }
    
    @PutMapping("/editcity/{id}")
    public void editCity(@PathVariable Integer id) {
        City city= findCity(id);
        cityServ.editCity(city);
    }
}
