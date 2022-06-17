package com.portfolio.beportfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
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
@Table(name = "skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    @Column(nullable = false, length = 150)
    private String description;
    @JsonIgnore
    @OneToMany(mappedBy = "idSkill", cascade = CascadeType.ALL)
    private Collection<UserSkill> skills= new ArrayList<>();
/*    
    public Skill(){
        
    }
    public Skill(int idSkill, String description){
        
        this.idSkill = idSkill;
        this.description = description;
        
    }
*/
}
