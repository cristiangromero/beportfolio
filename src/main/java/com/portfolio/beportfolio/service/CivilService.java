
package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Civil;
import com.portfolio.beportfolio.repository.CivilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CivilService implements ICivilService{
    
    @Autowired
    public CivilRepository civilRepo;
    
    @Override
    public List<Civil> listCivil() {
        return civilRepo.findAll();
    }

    @Override
    public void newCivil(Civil civil) {
        civilRepo.save(civil);
    }
    
    @Override
    public void deleteCivil(int id) {
       civilRepo.deleteById(id);
    }

    @Override
    public Civil findCivil(int id) {
       return civilRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editCivil(Civil civil) {
        civilRepo.save(civil);
    }
    
}
