package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.SocialMedia;
import java.util.List;

public interface ISocialMediaService {
    public List<SocialMedia> listSocialMedia();
    public void newSocialMedia(SocialMedia socialMedia);
    public void deleteSocialMedia(int id);
    public SocialMedia findSocialMedia(int id);
    public void editSocialMedia(SocialMedia socialMedia);
}
