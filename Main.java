package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char ltr;
        int n1 ,n2 ,n3;
        Scanner input = new Scanner(System.in);



        //q1

        System.out.println("Please choose one of these options: \n (a) for Admin. \n (s) for Supervisor. \n (u) for user.");
        ltr = input.next().charAt(0);

        if(ltr == 'a') {
            System.out.println("welcome admin.");
        } else if (ltr == 's') {
            System.out.println("welcome superuser" );
        } else if ( ltr == 'u' ) {
            System.out.println("welcome user.");
        }else
            System.out.println("invalid.");


        //q2

        System.out.println("Enter first number: ");
        n1 = input.nextInt();
        System.out.println("Enter second number: ");
        n2 = input.nextInt();
        System.out.println("Enter third number: ");
        n3 = input.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("greatest: " + n1);
        } else if (n2 > n1 && n2 > n3){
            System.out.println("greatest: " + n2);
        } else {
            System.out.println("greatest: " + n3);
        }


        //q3

        Random rndm = new Random();
        n1 = rndm.nextInt(7)+1;

        switch (n1){
            case 1:
                System.out.println("Sunday.");
            break;
            case 2:
                System.out.println("Monday.");
                break;
            case 3:
                System.out.println("Tuesday.");
                break;
            case 4:
                System.out.println("Wednesday.");
                break;
            case 5:
                System.out.println("Thursday.");
                break;
            case 6:
                System.out.println("Friday.");
                break;
            case 7:
                System.out.println("Saturday.");
                break;
            default:
                break;
        }
        System.out.println(n1);


        //q4

        System.out.println("Enter score: ");

        n1 = input.nextInt();
        if (n1 >= 90 && n1 <= 100){
            System.out.println("Grade: A");
        } else if (n1 >= 80 && n1 < 90){
            System.out.println("Grade: B.");
        } else if(n1 >= 70 && n1 < 80){
            System.out.println("Grade: C.");
        }else if(n1 >= 60 && n1 < 70){
            System.out.println("Grade: D.");
        }else if(n1 >= 0 && n1 < 60){
            System.out.println("Grade: F.");
        }else{
            System.out.println("Invalid");
        }



        //q5

        System.out.println("Enter your age: ");

        n1 = input.nextInt();
        if (n1 >= 20 && n1 < 150){
            System.out.println("You are an Adult.");
        } else if (n1 >= 13 && n1 <= 19){
            System.out.println("You are a Teenager.");
        } else if(n1 < 13 && n1 > 0){
            System.out.println("You are a Child.");
        }else{
            System.out.println("Invalid");
        }

    }
}