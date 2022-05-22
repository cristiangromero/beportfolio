package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.State;
import com.portfolio.beportfolio.model.State;
import com.portfolio.beportfolio.service.IStateService;
import com.portfolio.beportfolio.service.IStateService;
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
public class StateController {
    
    @Autowired
    private IStateService stateServ;    
    
    @PostMapping("/new/state")
    public void addState (@RequestBody State state){
        stateServ.newState(state);
    }
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
    
    @DeleteMapping("/deletestate/{id}")
    public void deleteState (@PathVariable Integer id){
        stateServ.deleteState(id);
    }
    
    @PutMapping("/edit/state")
    public void editState (@RequestBody State state){
        stateServ.editState(state);
    }
    
    @PutMapping("/editstate/{id}")
    public void editState(@PathVariable Integer id) {
        State state= findState(id);
        stateServ.editState(state);
    }
    
}
