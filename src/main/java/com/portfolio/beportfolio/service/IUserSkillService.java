package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.UserSkill;
import java.util.List;

public interface IUserSkillService {
    public List<UserSkill> listUserSkill();
    public void newUserSkill(UserSkill userSkill);
    public void editUserSkill(UserSkill userSkill);
}
