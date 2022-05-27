
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Civil;
import java.util.List;

public interface ICivilService {
    public List<Civil> listCivil();
    public void newCivil(Civil civil);
    public void deleteCivil(Civil civil);
    public Civil findCivil(Long id);
    public void editCivil(Civil civil);
}
