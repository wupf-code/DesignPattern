package com.wpf.composite;

public class TextFile extends AbstractFile{
    private String name;
    public TextFile (String name) {
        this.name = name;
    }
    @Override
    void add(AbstractFile file) {
        // TODO Auto-generated method stub
        System.out.println("对不起，不支持此方法");
    }

    @Override
    void remove(AbstractFile file) {
        // TODO Auto-generated method stub
        System.out.println("对不起，不支持此方法");
    }

    @Override
    AbstractFile getChild(int i) {
        // TODO Auto-generated method stub
        System.out.println("对不起，不支持此方法");
        return null;
    }

    @Override
    void killVirus() {
        // TODO Auto-generated method stub
        System.out.println("对文本文件'" + name + "'进行杀毒");
    }
    
}
