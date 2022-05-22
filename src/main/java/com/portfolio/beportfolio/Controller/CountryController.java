package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Country;
import com.portfolio.beportfolio.service.ICountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class CountryController {
    @Autowired
    private ICountryService countryServ;
    
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
}
