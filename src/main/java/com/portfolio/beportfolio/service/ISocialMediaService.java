package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.SMedia;
import java.util.List;

public interface ISocialMediaService {
    public List<SMedia> listSocialMedia();
    public void newSocialMedia(SMedia socialMedia);
    public void deleteSocialMedia(int id);
    public SMedia findSocialMedia(int id);
    public void editSocialMedia(SMedia socialMedia);
}
