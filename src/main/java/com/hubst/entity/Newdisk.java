package com.hubst.entity;

import java.io.Serializable;

/**
 * (Newdisk)实体类
 *
 * @author makejava
 * @since 2023-08-03 11:04:45
 */
public class Newdisk implements Serializable {
    private static final long serialVersionUID = 973771205425789836L;
    
    private Long diskid;
    
    private String diskname;
    
    private String diskimgid;
    
    private String diskprice;
    
    private String state;

    private Image image;


    public Long getDiskid() {
        return diskid;
    }

    public void setDiskid(Long diskid) {
        this.diskid = diskid;
    }

    public String getDiskname() {
        return diskname;
    }

    public void setDiskname(String diskname) {
        this.diskname = diskname;
    }

    public String getDiskimgid() {
        return diskimgid;
    }

    public void setDiskimgid(String diskimgid) {
        this.diskimgid = diskimgid;
    }

    public String getDiskprice() {
        return diskprice;
    }

    public void setDiskprice(String diskprice) {
        this.diskprice = diskprice;
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

