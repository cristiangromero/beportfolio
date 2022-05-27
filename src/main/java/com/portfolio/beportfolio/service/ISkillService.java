package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> listSkill();
    public void newSkill(Skill skill);
    public void deleteSkill(Skill skill);
    public Skill findSkill(Long id);
    public void editSkill(Skill skill);
}
