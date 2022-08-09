package com.wpf.bridge;

public abstract class phone {
    private brand br;
    public phone(brand br){
        super();
        this.br = br;
    }

    protected void open() {
        br.open();
    }
    protected void close() {
        br.close();
    }
    protected void call() {
        br.call();
    }
}
