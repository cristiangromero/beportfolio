package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Country;
import com.portfolio.beportfolio.service.ICountryService;
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
public class CountryController {
    @Autowired
    private ICountryService countryServ;    
    
    @PostMapping("/api/country")
    public void addCountry (@RequestBody Country country){
        countryServ.newCountry(country);
    }
    @GetMapping("/api/country")
    @ResponseBody
    public List<Country> listCountry(){
        return countryServ.listCountry();
    }
   
    @GetMapping("/api/country/{id}")
    @ResponseBody
    public Country findCountry(@PathVariable Long id){
        return countryServ.findCountry(id);
    }
    
    @DeleteMapping("/api/country/{id}")
    public void deleteCountry (@PathVariable Long id){
        Country country= findCountry(id);
        countryServ.deleteCountry(country);
    }
    
    @PutMapping("/api/country")
    public void editCountry (@RequestBody Country country){
        countryServ.editCountry(country);
    }
    
    @PutMapping("/api/country/{id}")
    public void editCountry(@PathVariable Long id) {
        Country country= findCountry(id);
        countryServ.editCountry(country);
    }
}
