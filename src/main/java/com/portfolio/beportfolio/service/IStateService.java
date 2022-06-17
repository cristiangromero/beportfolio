
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.State;
import java.util.List;


public interface IStateService {
    public List<State> listState();
    public void newState(State state);
    public void deleteState(State state);
    public State findState(Long id);
    public void editState(State state);
}
