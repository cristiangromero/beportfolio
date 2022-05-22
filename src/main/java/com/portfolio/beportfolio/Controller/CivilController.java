package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Civil;
import com.portfolio.beportfolio.service.ICivilService;
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
public class CivilController {
    @Autowired
    private ICivilService civilServ;    
    
    @PostMapping("/new/civil")
    public void addCivil (@RequestBody Civil civil){
        civilServ.newCivil(civil);
    }
    @GetMapping("/list/civil")
    @ResponseBody
    public List<Civil> listCivil(){
        return civilServ.listCivil();
    }
   
    @GetMapping("/findcivil/{id}")
    @ResponseBody
    public Civil findCivil(@PathVariable Integer id){
        return civilServ.findCivil(id);
    }
    
    @DeleteMapping("/deletecivil/{id}")
    public void deleteCivil (@PathVariable Integer id){
        civilServ.deleteCivil(id);
    }
    
    @PutMapping("/edit/civil")
    public void editCivil (@RequestBody Civil civil){
        civilServ.editCivil(civil);
    }
    
    @PutMapping("/editcivil/{id}")
    public void editCivil(@PathVariable Integer id) {
        Civil civil= findCivil(id);
        civilServ.editCivil(civil);
    }  
}
