package org.martin.operators;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        //a = a+2;
        //a+=2;

        a /= 2;
        System.out.println(a);

        int b = 3;

        boolean answer = a < b;
        System.out.println(answer);

        answer = a ==b;
        System.out.println(answer);


        boolean answer2 = a==2 ||b ==3;
        System.out.println(answer2);

        answer2 = a==2 && b ==3;
        System.out.println(answer2);

//        if(a>3){
//            System.out.println("A is greater than 3");
//        }
//        else {
//            System.out.println("A is less than 3");
//        }

        if(a>0){
            System.out.println("Positive");

        }else if (a<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("The number is 0");
        }


        switch (a)
        {
            case 1:
                System.out.println("A is one");
                break;
            case 2:
                System.out.println("A is two");
                break;
            case 3:
                System.out.println("A is three");
                break;
            default:
                System.out.println("A is not one, two or three");
                break;
        }
    }

}
