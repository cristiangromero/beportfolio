
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Civil;
import java.util.List;

public interface ICivilService {
    public List<Civil> listCivil();
    public Civil findCivil (int id);
}
