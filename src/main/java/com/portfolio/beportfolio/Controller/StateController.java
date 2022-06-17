package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.State;
import com.portfolio.beportfolio.service.IStateService;
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
public class StateController {
    @Autowired
    private IStateService stateServ;    
    
    @PostMapping("/api/state")
    public void addState (@RequestBody State state){
        stateServ.newState(state);
    }
    @GetMapping("/api/state")
    @ResponseBody
    public List<State> listState(){
        return stateServ.listState();
    }
   
    @GetMapping("/api/state/{id}")
    @ResponseBody
    public State findState(@PathVariable Long id){
        return stateServ.findState(id);
    }
    
    @DeleteMapping("/api/state/{id}")
    public void deleteState (@PathVariable Long id){
        State state= findState(id);
        stateServ.deleteState(state);
    }
    
    @PutMapping("/api/state")
    public void editState (@RequestBody State state){
        stateServ.editState(state);
    }
    
    @PutMapping("/api/state/{id}")
    public void editState(@PathVariable Long id) {
        State state= findState(id);
        stateServ.editState(state);
    }
}
