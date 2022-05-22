package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Country;
import com.portfolio.beportfolio.service.ICountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class CountryController {
    @Autowired
    private ICountryService countryServ;    
    
    @PostMapping("/new/country")
    public void addCountry (@RequestBody Country country){
        countryServ.newCountry(country);
    }
    @GetMapping("/list/country")
    @ResponseBody
    public List<Country> listCountry(){
        return countryServ.listCountry();
    }
   
    @GetMapping("/findcountry/{id}")
    @ResponseBody
    public Country findCountry(@PathVariable Integer id){
        return countryServ.findCountry(id);
    }
    
    @DeleteMapping("/deletecountry/{id}")
    public void deleteCountry (@PathVariable Integer id){
        countryServ.deleteCountry(id);
    }
    
    @PutMapping("/edit/country")
    public void editCountry (@RequestBody Country country){
        countryServ.editCountry(country);
    }
    
    @PutMapping("/editcountry/{id}")
    public void editCountry(@PathVariable Integer id) {
        Country country= findCountry(id);
        countryServ.editCountry(country);
    }
}
