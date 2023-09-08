package com.hubst.entity;

import java.io.Serializable;
import java.security.SecureRandom;

/**
 * (Rank)实体类
 *
 * @author makejava
 * @since 2023-08-03 10:42:01
 */
public class Rank implements Serializable {
    private static final long serialVersionUID = 254232342096447382L;
    
    private Long rankid;
    
    private String rankname;
    
    private String rankimgid;

    private String rankcontid;

    private RankContent rankContent;

    private Image image;


    private String state;


    public Long getRankid() {
        return rankid;
    }

    public void setRankid(Long rankid) {
        this.rankid = rankid;
    }

    public String getRankname() {
        return rankname;
    }

    public void setRankname(String rankname) {
        this.rankname = rankname;
    }

    public String getRankimgid() {
        return rankimgid;
    }

    public void setRankimgid(String rankimgid) {
        this.rankimgid = rankimgid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRankcontid() {
        return rankcontid;
    }

    public void setRankcontid(String rankcontid) {
        this.rankcontid = rankcontid;
    }

    public RankContent getRankContent() {
        return rankContent;
    }

    public void setRankContent(RankContent rankContent) {
        this.rankContent = rankContent;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}

