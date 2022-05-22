
package com.portfolio.beportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idState;
    private String description;
    @ManyToOne
    @JoinColumn(name = "idCountry")
    private Country idCountry;
    
    public State(){
        
    }
    public State(int idState, String description, Country idCountry){
        
        this.idState = idState;
        this.description = description;
        this.idCountry = idCountry;

    }
}
