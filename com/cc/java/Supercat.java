package com.cc.java;

public class Supercat {

    private String name;
    private String furColor;
    protected int age; 
 

    public Supercat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }


    public String getStringAttributes(String op) {
        switch (op) {
          case "#name":
            return name;
          case "#color":
            return furColor;
          default:
            return "ERROR!";
        }
      }


}
