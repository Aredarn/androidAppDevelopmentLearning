package org.martin.ifac;

public class Main {
    public static void main(String[] args) {

        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(60);

        CarInterface fossilCarInterface = new FossilFuelCar("Mazda");
        fossilCarInterface.start();
        fossilCarInterface.move(55);

        //ABSTRACT CLASSES//

        TestAbstractAbstract test = new TestAbstractClass("mak");
        test.printName("Martin");



    }
}
