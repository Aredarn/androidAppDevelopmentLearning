package org.martin;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=0;
        boolean win = false;
        System.out.println("Welcome!");
        System.out.println("What is your name, challenger?: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Let's begin the game!");

        Random random = new Random();
        int randomNum = random.nextInt(20);



        System.out.println("Guess the number: ");
        int guess = scanner.nextInt();

        while (i != 5 && guess !=randomNum) {
            guess = scanner.nextInt();
            i++;
            if(guess<randomNum){
                System.out.println("The number is bigger");
            }
            else if (guess>randomNum){
                System.out.println("The number is smaller");
            }else {
                win = true;
                break;
            }
        }

        if(win){
            System.out.println("YOU WIN!");
        }
        else {
            System.out.println("You lost");
        }

    }
}
