package org.martin.oop_3;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes AMG", 2, "silver", new engine("Renault", 8000));
        System.out.println(mercedes.getName());

        engine Engine = mercedes.getEngine();

        System.out.println("Engine model: " +mercedes.getEngine().getModel());


        Car audi = null;
        if(audi!=null){
            audi.getName();
        }
        else {
            System.out.println("The car is null.");
        }


    }
}
