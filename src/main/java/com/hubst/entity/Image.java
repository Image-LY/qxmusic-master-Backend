package com.hubst.entity;

import java.io.Serializable;

/**
 * (Image)实体类
 *
 * @author makejava
 * @since 2023-08-01 16:18:04
 */
public class Image implements Serializable {
    private static final long serialVersionUID = -70838038549279352L;
    
    private Long id;
    
    private String url;


    private String title;
    
    private String type;
    
    private String state;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}

