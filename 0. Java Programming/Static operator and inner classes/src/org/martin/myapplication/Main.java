package org.martin.myapplication;

public class Main {
    public static void main(String[] args) {
        TestClass.name = "Martin";
        TestClass testClass = new TestClass(25, "White");

        System.out.println("Name: " + testClass.getName());

        TestClass.prtinSomething();





    }
}
