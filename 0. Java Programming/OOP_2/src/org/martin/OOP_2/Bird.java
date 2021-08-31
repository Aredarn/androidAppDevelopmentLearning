package org.martin.OOP_2;

public class Bird extends Animal {
       private int wings;

       public Bird(String name, String color, int legs, boolean hasTale, int wings) {
              super(name, color, legs, hasTale);
              this.wings = wings;
       }
       public void Fly(){
              System.out.println(this.getName() + " is flying");
       }


       @Override
       public void eat(String food) {

              System.out.println("Chewing " + food);
       }

       public int getWings() {
              return wings;
       }

       public void setWings(int wings) {
              this.wings = wings;
       }
}
