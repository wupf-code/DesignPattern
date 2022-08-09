package com.wpf.bridge;

import org.omg.PortableInterceptor.ORBIdHelper;

public class FoldedPhone extends phone {

    public FoldedPhone(brand br) {
        super(br);
        //TODO Auto-generated constructor stub
    }
    public void open(){
        super.open();
        System.out.println("折叠手机");
    }
    public void close(){
        super.close();
        System.out.println("折叠手机");
    }
    public void call(){
        super.call();
        System.out.println("折叠手机");
    }
}
