package org.martin.challeneg_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Age: ");
        int age = scanner.nextInt();




        LeftEye lEye = new LeftEye("Left eye", "Short sighted", "Blue");
        RightEye rEye = new RightEye("Right eye", "Normal", "Blue");
        Heart heart = new Heart("Heart", "Normal", 70);
        Stomach stomach = new Stomach("Stomach", "Starving");
        Skin skin = new Skin("Skin", "Burnt");

        System.out.println("Choose an organ: ");


        int chosenOrgan =1;
        while (chosenOrgan>0 && chosenOrgan<6) {
            System.out.println("1. " + lEye.getName());
            System.out.println("2. " + rEye.getName());
            System.out.println("3. " + heart.getName());
            System.out.println("4. " + stomach.getName());
            System.out.println("5. " + skin.getName());
            System.out.println("6. Quit");

            chosenOrgan = scanner.nextInt();

            switch (chosenOrgan) {
                case 1:
                    System.out.println(lEye.getName());
                    System.out.println(lEye.getMedicalCondition());
                    System.out.println(lEye.getColor());
                    System.out.println("\t 1. Close the eye.");
                    chosenOrgan = scanner.nextInt();
                    if (chosenOrgan == 1){
                        System.out.println(lEye.getName() + " closed");
                        {break;}}
                    else
                        break;
                case 2:
                    System.out.println(rEye.getName());
                    System.out.println(rEye.getMedicalCondition());
                    System.out.println(rEye.getColor());
                    System.out.println("\t 1. Close the eye.");
                    chosenOrgan = scanner.nextInt();
                    if (chosenOrgan == 1){
                        System.out.println(rEye.getName() + " closed");
                        {break;}}
                    else
                        break;
                case 3:
                    System.out.println(heart.getName());
                    System.out.println(heart.getMedicalCondition());
                    System.out.println(heart.getHearthRate());
                    System.out.println("\t 1. Change heart rate: ");
                    chosenOrgan = scanner.nextInt();
                    if (chosenOrgan == 1) {
                        System.out.println("HeartRate: ");
                        int heartRate = scanner.nextInt();
                        heart.setHearthRate(heartRate);
                        System.out.println("New heart rate:" + heart.getHearthRate());
                        break;
                    }
                    else
                        break;
                case 4:
                    System.out.println(stomach.getName());
                    System.out.println(stomach.getMedicalCondition());
                    System.out.println("\t 1. Digest");
                    chosenOrgan = scanner.nextInt();
                    if (chosenOrgan == 1) {
                        System.out.println("Stomach is now fed.");
                        stomach.setMedicalCondition("Fed");
                        break;
                    }
                    else
                        break;
                case 5:
                    System.out.println(skin.getName());
                    System.out.println(skin.getMedicalCondition());
                default:
                    break;

            }

        }







    }
}
