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
@Table(name = "studyLevels")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyLevel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStudylevel;
    @Column(nullable = false, length = 150)
    private String description;
/*    
    public StudyLevel(){
        
    }
    public StudyLevel(int idStudylevel, String description){
        
        this.idStudylevel = idStudylevel;
        this.description = description;
        
    }
*/    
}
