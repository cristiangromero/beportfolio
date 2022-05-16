package com.portfolio.beportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "studylevel")
public class Studylevel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idStudylevel;
    private String description;
    
    public Studylevel(){
        
    }
    public Studylevel(int idStudylevel, String description){
        
        this.idStudylevel = idStudylevel;
        this.description = description;
        
    }
    
}
