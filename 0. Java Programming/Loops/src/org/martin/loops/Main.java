package org.martin.loops;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 5;

        for(int i=0;i<a;i++){
            System.out.println(i);
        }

        while (a<10){
            System.out.println("Hello");
            a++;
            //break;
        }

        do {
            System.out.println("Hello there");
        }while (a<5);

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        System.out.println("Answer was: " + answer);

        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Name:" + name);

        Random random = new Random();
        int number = random.nextInt();
        System.out.println("Number: "+number);
    }
}
