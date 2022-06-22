package com.portfolio.beportfolio.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
    @Column(nullable = false, length = 150)
    private String name;
    @Column(nullable = false, length = 150)
    private String surname;
    @Column(length = 150)
    private String email;
    @Column(length = 15)
    private String phone;
    @Column(nullable = true, length = 150)
    private String street;
    @Column(nullable = true)
    private int streetNumber;
    private java.sql.Date birth;
    @Column(nullable = true)
    private int children;
    private String picture;
    private String iam;
    private String aboutme;
    
    @ManyToOne
    @JoinColumn(name = "idCivil")
    private Civil civil;
    @ManyToOne
    @JoinColumn(name = "idCity")
    private City city;
    
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Language> languages;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Skill> skills;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<SocialMedia> socials;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Project> projects;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Course> courses;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Experience> experiences;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Education> educations;
    
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
        for(Language l : languages) {
            l.setUser(this);
        }
    }
    
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
        for(Skill l : skills) {
            l.setUser(this);
        }
    }
    
    public void setSocials(List<SocialMedia> socials) {
        this.socials = socials;
        for(SocialMedia l : socials) {
            l.setUser(this);
        }
    }
    
    public void setProjects(List<Project> projects) {
        this.projects = projects;
        for(Project l : projects) {
            l.setUser(this);
        }
    }
    
    public void setCourses(List<Course> courses) {
        this.courses = courses;
        for(Course l : courses) {
            l.setUser(this);
        }
    }
    
    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
        for(Experience l : experiences) {
            l.setUser(this);
        }
    }
    
    public void setEducations(List<Education> educations) {
        this.educations = educations;
        for(Education l : educations) {
            l.setUser(this);
        }
    }
    
}