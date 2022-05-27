package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> listSkill();
    public void newSkill(Skill skill);
    public void deleteSkill(int id);
    public Skill findSkill(int id);
    public void editSkill(Skill skill);
}
