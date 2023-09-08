package com.hubst.entity;

import java.io.Serializable;

/**
 * (Newsong)实体类
 *
 * @author makejava
 * @since 2023-08-03 10:42:01
 */
public class Newsong implements Serializable {
    private static final long serialVersionUID = -98640084647732622L;
    
    private Long typeid;
    
    private String typename;
    
    private String typeimgid;
    
    private String state;

    private Image image;


    public Long getTypeid() {
        return typeid;
    }

    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getTypeimgid() {
        return typeimgid;
    }

    public void setTypeimgid(String typeimgid) {
        this.typeimgid = typeimgid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }


}

