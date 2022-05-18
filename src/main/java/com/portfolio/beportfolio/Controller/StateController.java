package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.State;
import com.portfolio.beportfolio.service.IStateService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {
    
    @Autowired
    private IStateService stateServ;
    
    @GetMapping("/list/state")
    @ResponseBody
    public List<State> listState(){
        return stateServ.listState();
    }
   
    @GetMapping("/findstate/{id}")
    @ResponseBody
    public State findState(@PathVariable Integer id){
    return stateServ.findState(id);
    }
    
}
