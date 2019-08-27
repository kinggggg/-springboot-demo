package com.zeek.springboot.springbootdemo.service;

public class PersonImpl implements Person {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String say() {
        if (null == name) {
            return "zhangsan" ;
        }

        return "Hello, " + name;
    }
}
