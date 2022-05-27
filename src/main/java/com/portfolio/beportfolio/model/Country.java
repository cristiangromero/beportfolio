
package com.portfolio.beportfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "country")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCountry;
    @Column(nullable = false, length = 150)
    private String description;
/*    
    public Country(){
        
    }
    public Country(int idCountry, String description){
        
        this.idCountry = idCountry;
        this.description = description;
        
    }
*/    
}
