package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.UserSocialMedia;
import java.util.List;

public interface IUserSocialMediaService {
    public List<UserSocialMedia> listUserSocialMedia();
    public void newUserSocialMedia(UserSocialMedia userSocialMedia);
    public void editUserSocialMedia(UserSocialMedia userSocialMedia);
}
