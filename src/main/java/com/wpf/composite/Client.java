package com.wpf.composite;

public class Client {
    public static void main(String[] args) {
        AbstractFile file1, file2, file3, file4, folder1, folder2, folder3;
        folder1 = new Folder("武鹏飞的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new TextFile("九阴真经");
        file4 = new TextFile("葵花宝典");

        folder2.add(file1);
        folder2.add(file3);
        folder3.add(file2);
        folder3.add(file4);

        folder1.add(folder2);
        folder1.add(folder3);

        folder1.killVirus();
    }
}
