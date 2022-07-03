package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.beportfolio.repository.PersonRepository;

@Service
public class PersonService implements IPersonService {
 
    @Autowired
    public PersonRepository personRepo;
    
    @Override
    public List<Person> listPersons() {
        return personRepo.findAll();
    }

    @Override
    public void newPerson(Person usr) {
        personRepo.save(usr);
    }
    
    @Override
    public void deletePerson(Person usr) {
       personRepo.delete(usr);
    }

    @Override
    public Person findPerson(Long id) {
       return personRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editPerson(Person usr) {
        personRepo.save(usr);
    }
 
}
