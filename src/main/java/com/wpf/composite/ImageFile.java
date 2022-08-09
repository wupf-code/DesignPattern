package com.wpf.composite;

public class ImageFile extends AbstractFile{
    private String name;

    public ImageFile(String nString){
        this.name = name;
    }
    @Override
    void add(AbstractFile file) {
        // TODO Auto-generated method stub
        System.out.println("对不起不支持此方法");
    }

    @Override
    void remove(AbstractFile file) {
        // TODO Auto-generated method stub
        System.out.println("对不起不支持此方法");
    }

    @Override
    AbstractFile getChild(int i) {
        // TODO Auto-generated method stub
        System.out.println("对不起不支持此方法");
        return null;
    }

    @Override
    void killVirus() {
        // TODO Auto-generated method stub
        System.out.println("对图像文件杀毒");
    }
    
}
