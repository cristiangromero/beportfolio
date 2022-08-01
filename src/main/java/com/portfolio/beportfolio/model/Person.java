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
@Table(name = "persons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPerson;
    @Column(nullable = false, length = 150)
    private String name;
    @Column(nullable = false, length = 150)
    private String surname;
    @Column(length = 150)
    private String email;
    @Column(length = 15)
    private String phone;
    @Column(nullable = true, length = 250)
    private String address;
    private java.sql.Date birth;
    @Column(nullable = true)
    private int children;
    private String lastGraduation;
    private String avatar;
    private String iam;
    private String aboutme;
    private String civil;
    /*
    @ManyToOne
    @JoinColumn(name = "idCivil")
    private Civil civil;
   
    @ManyToOne
    @JoinColumn(name = "idCity")
    private City city;
    */
    
    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List<Language> languages;
    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List<Skill> skills;
    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List<SocialMedia> socials;
    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List<Project> projects;
    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List<Course> courses;
    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List<Experience> experiences;
    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List<Education> educations;
    
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
        for(Language l : languages) {
            l.setPerson(this);
        }
    }
    
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
        for(Skill l : skills) {
            l.setPerson(this);
        }
    }
    
    public void setSocials(List<SocialMedia> socials) {
        this.socials = socials;
        for(SocialMedia l : socials) {
            l.setPerson(this);
        }
    }
    
    public void setProjects(List<Project> projects) {
        this.projects = projects;
        for(Project l : projects) {
            l.setPerson(this);
        }
    }
    
    public void setCourses(List<Course> courses) {
        this.courses = courses;
        for(Course l : courses) {
            l.setPerson(this);
        }
    }
    
    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
        for(Experience l : experiences) {
            l.setPerson(this);
        }
    }
    
    public void setEducations(List<Education> educations) {
        this.educations = educations;
        for(Education l : educations) {
            l.setPerson(this);
        }
    }
    
}