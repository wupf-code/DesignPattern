package com.wpf.prototype.shallowclone;

import java.io.Serializable;

public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void downloda(){
        System.out.println("下载附件为" + name);
    }
}
