
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.State;
import com.portfolio.beportfolio.repository.StateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService implements IStateService{
    
    @Autowired
    public StateRepository stateRepo;
    
    @Override
    public List<State> listState() {
        return stateRepo.findAll();
    }

    @Override
    public void newState(State state) {
        stateRepo.save(state);
    }
    
    @Override
    public void deleteState(State state) {
       stateRepo.delete(state);
    }

    @Override
    public State findState(Long id) {
       return stateRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editState(State state) {
        stateRepo.save(state);
    }
}
