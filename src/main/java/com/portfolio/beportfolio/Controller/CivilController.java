package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Civil;
import com.portfolio.beportfolio.service.ICivilService;
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
public class CivilController {
    @Autowired
    private ICivilService civilServ;    
    
    @PostMapping("/api/civil")
    public void addCivil (@RequestBody Civil civil){
        civilServ.newCivil(civil);
    }
    @GetMapping("/api/civil")
    @ResponseBody
    public List<Civil> listCivil(){
        return civilServ.listCivil();
    }
   
    @GetMapping("/api/civil/{id}")
    @ResponseBody
    public Civil findCivil(@PathVariable Long id){
        return civilServ.findCivil(id);
    }
    
    @DeleteMapping("/api/civil/{id}")
    public void deleteCivil (@PathVariable Long id){
        Civil civil= findCivil(id);
        civilServ.deleteCivil(civil);
    }
    
    @PutMapping("/api/civil")
    public void editCivil (@RequestBody Civil civil){
        civilServ.editCivil(civil);
    }
    
    @PutMapping("/api/civil/{id}")
    public void editCivil(@PathVariable Long id) {
        Civil civil= findCivil(id);
        civilServ.editCivil(civil);
    }
}