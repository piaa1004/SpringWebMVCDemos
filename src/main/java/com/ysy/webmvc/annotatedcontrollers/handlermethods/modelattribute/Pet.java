package com.ysy.webmvc.annotatedcontrollers.handlermethods.modelattribute;

public class Pet {
    public String name;
    public Integer age;

    @Override public String toString() {
        return "Pet{name=" + name + ", age=" + age + "}";
    }
}
