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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/state")
public class StateController {
    @Autowired
    private IStateService stateServ;    
    
    @PostMapping
    public void addState (@RequestBody State state){
        stateServ.newState(state);
    }
    @GetMapping
    @ResponseBody
    public List<State> listState(){
        return stateServ.listState();
    }
   
    @GetMapping("/{id}")
    @ResponseBody
    public State findState(@PathVariable Long id){
        return stateServ.findState(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteState (@PathVariable Long id){
        State state= findState(id);
        stateServ.deleteState(state);
    }
    
    @PutMapping
    public void editState (@RequestBody State state){
        stateServ.editState(state);
    }
    
    @PutMapping("/{id}")
    public void editState(@PathVariable Long id) {
        State state= findState(id);
        stateServ.editState(state);
    }
}
