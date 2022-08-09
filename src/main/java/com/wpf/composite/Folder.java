package com.wpf.composite;

import java.util.ArrayList;

public class Folder extends AbstractFile {
    private String name;
    private ArrayList<AbstractFile> fileList = new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        // TODO Auto-generated method stub
        fileList.add(file);
    }

    @Override
    void remove(AbstractFile file) {
        // TODO Auto-generated method stub
        fileList.remove(file);
    }

    @Override
    AbstractFile getChild(int i) {
        // TODO Auto-generated method stub
        return fileList.get(i);
    }

    @Override
    void killVirus() {
        // TODO Auto-generated method stub
        System.out.println("对文件夹杀毒");
        for(Object object : fileList){
            ((AbstractFile)object).killVirus();
        }
    }

    
}
