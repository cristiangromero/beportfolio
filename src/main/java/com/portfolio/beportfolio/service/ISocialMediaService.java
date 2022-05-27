package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.SocialMedia;
import java.util.List;

public interface ISocialMediaService {
    public List<SocialMedia> listSocialMedia();
    public void newSocialMedia(SocialMedia socialMedia);
    public void deleteSocialMedia(SocialMedia socialMedia);
    public SocialMedia findSocialMedia(Long id);
    public void editSocialMedia(SocialMedia socialMedia);
}
