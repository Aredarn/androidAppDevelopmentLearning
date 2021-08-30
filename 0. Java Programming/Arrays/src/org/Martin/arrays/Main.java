package org.Martin.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = new String[5];
        students[1] = "Martin";
        students[0] = "Sarah";
        students[2] = "Thomas";
        students[3] = "Sam";
        students[4] = "Diego";

        //System.out.println(students[2]);

        String[] employees = {"Edward", "May", "Cody"};
        int[] numbers = {1, 2,3,4,5,6};
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }



        String[] names = {"Martin", "Sandor", "Ervin", "Adrian", "Tom"};
        int[] number = {123456, 32534633, 35325333,353535,875323};

        for(int i = 0;i<names.length;i++){
            System.out.println(names[i]);
        }

        System.out.println("Please enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(int i = 0;i<names.length;i++){
            if (name.equals(names[i])){
                System.out.println(number[i]);
            }
        }

    }
}
