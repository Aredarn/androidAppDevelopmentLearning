package org.martin.ifac;

public abstract class TestAbstractAbstract {
    public abstract void printName(String name);

    private String name;

    public TestAbstractAbstract(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(String text){
        System.out.println(text);
    }

}
