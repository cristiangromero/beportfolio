package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.City;
import com.portfolio.beportfolio.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    private ICityService cityServ;
    
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
    
}
