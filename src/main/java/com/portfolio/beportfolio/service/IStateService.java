
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.State;
import java.util.List;


public interface IStateService {
    
    public List<State> listState();
    public State findState (int id); 
    
}
