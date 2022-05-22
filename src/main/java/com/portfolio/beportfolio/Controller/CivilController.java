package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Civil;
import com.portfolio.beportfolio.service.ICivilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CivilController {
    @Autowired
    private ICivilService civilServ;
    
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
}
