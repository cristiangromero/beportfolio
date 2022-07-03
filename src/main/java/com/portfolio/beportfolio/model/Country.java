
package com.portfolio.beportfolio.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "countries")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCountry;
    @Column(nullable = false, length = 150)
    private String description;
    @OneToMany(mappedBy = "countries",cascade = CascadeType.ALL)
    private List<State> states;
/*    
    public Country(){
        
    }
    public Country(int idCountry, String description){
        
        this.idCountry = idCountry;
        this.description = description;
        
    }
*/    
}
