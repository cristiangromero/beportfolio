
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
    public Civil findCivil(int id) {
       return civilRepo.findById(id).orElse(null);
    }
    
}
