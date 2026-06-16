package com.ysy.webmvc.viewtech.xmlmarshalling;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Person {

    @XmlAttribute public String name;
    @XmlAttribute public int age;

    public Person() {}
    public Person(String name, int age) { this.name = name; this.age = age; }
}
