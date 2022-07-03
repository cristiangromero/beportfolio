package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Person;
import java.util.List;

public interface IPersonService {
    
    public List<Person> listPersons();
    public void newPerson(Person usr);
    public void deletePerson(Person usr);
    public Person findPerson (Long id);
    public void editPerson(Person usr);
    
}
