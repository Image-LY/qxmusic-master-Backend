package com.hubst.entity;

import java.io.Serializable;

/**
 * (RankContent)实体类
 *
 * @author makejava
 * @since 2023-08-03 13:27:42
 */
public class RankContent implements Serializable {
    private static final long serialVersionUID = 952790245632330956L;
    
    private Long rankid;
    
    private String content1;

    private String content2;

    private String content3;


    private String state;


    public Long getRankid() {
        return rankid;
    }

    public void setRankid(Long rankid) {
        this.rankid = rankid;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public String getContent3() {
        return content3;
    }

    public void setContent3(String content3) {
        this.content3 = content3;
    }

}

