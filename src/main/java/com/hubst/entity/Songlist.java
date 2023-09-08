package com.hubst.entity;

import java.io.Serializable;

/**
 * (Songlist)实体类
 *
 * @author makejava
 * @since 2023-08-02 23:54:15
 */
public class Songlist implements Serializable {
    private static final long serialVersionUID = 886289354921855220L;


    private Image image;
    private Long listid;
    
    private String listname;
    
    private String listexplain;
    
    private String listimgid;


    public Long getListid() {
        return listid;
    }

    public void setListid(Long listid) {
        this.listid = listid;
    }

    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname;
    }

    public String getListexplain() {
        return listexplain;
    }

    public void setListexplain(String listexplain) {
        this.listexplain = listexplain;
    }

    public String getListimgid() {
        return listimgid;
    }

    public void setListimgid(String listimgid) {
        this.listimgid = listimgid;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}

