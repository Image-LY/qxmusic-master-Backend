package com.hubst.entity;

import java.io.Serializable;

/**
 * (Song)实体类
 *
 * @author makejava
 * @since 2023-08-01 21:59:31
 */
public class Song implements Serializable {
    private static final long serialVersionUID = -90209053631085793L;
    
    private Integer songid;
    
    private String songurl;
    
    private String singer;
    
    private String name;
    
    private Long imageid;

    private String state;


    private Long songlisttype;

    private Image image;


    public Integer getSongid() {
        return songid;
    }

    public void setSongid(Integer songid) {
        this.songid = songid;
    }

    public String getSongurl() {
        return songurl;
    }

    public void setSongurl(String songurl) {
        this.songurl = songurl;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getImageid() {
        return imageid;
    }

    public void setImageid(Long imageid) {
        this.imageid = imageid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Image getImage() {return image;}

    public void setImage(Image image) {this.image = image;}

    public Long getSonglisttype() {
        return songlisttype;
    }

    public void setSonglisttype(Long songlisttype) {
        this.songlisttype = songlisttype;
    }




}

