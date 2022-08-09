package com.wpf.bridge;

public class Client {
    public static void main(String[] args) {
        phone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        phone foldPhone2 = new FoldedPhone(new Vivo());
        foldPhone2.open();
        foldPhone2.call();
        foldPhone2.close();
    }
}
