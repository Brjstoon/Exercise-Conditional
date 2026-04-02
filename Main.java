package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //q1
        System.out.println("Please enter your weight: ");
        int weight = input.nextInt();
        System.out.println("Please enter your hight: ");
        double hight = input.nextDouble();
        double bmi = weight / (hight*hight) ;
        System.out.println("Your BMI is: " + bmi);

        //q2

        System.out.println("Please enter the total marks: ");
        double totMar = input.nextDouble();
        System.out.println("Please enter your marks: ");
        double mar = input.nextDouble();
        double perc = (mar / totMar)*100 ;
        System.out.println("Percentage = " + perc+"%");


        //q3

        System.out.println("Please enter the currency: ");
        String curency = input.nextLine();
        System.out.println("Please enter the amount in Ryials to be exchanged: ");
        double amnt = input.nextDouble();
        System.out.println("Please enter the exchange rate: ");
        double exrat = input.nextDouble();
        double s = amnt * exrat ;
        System.out.println("Amount in " + curency + ": " + s);


        //q4

        System.out.println("Enter any text and i will give you its length and the text in reverse: ");
        String txt1 = input.nextLine();

        System.out.println("the txt length: "+ txt1.length());
        StringBuilder sb = new StringBuilder(txt1);

        System.out.println("The text in reverse: " + sb.reverse());


        //q5

        System.out.println("Enter a sentence to extract from index 10 to 20: ");
        String txt2 = input.nextLine();

        System.out.println("the cut text: "+ txt2.substring(10,20));


        //q6

        System.out.println("Enter a text: ");
        String txt3 = input.nextLine();
        String keyword = "jumps";

        if (txt3.contains(keyword)){
            System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");
        }



        //q7

        System.out.println("Enter text: ");
        String txt4 = input.nextLine();
        System.out.println("Enter the word that will be replaced: ");
        String wordToReplace = input.nextLine();
        System.out.println("Enter the replacment word: ");
        String replacmentWord = input.nextLine();

        System.out.println("The sentence after being modified: " + txt4.replace(wordToReplace, replacmentWord));


        //q8

        System.out.println("Enter first string: ");
        String str1 = input.nextLine();

        System.out.println("Enter secund string: ");
        String str2 = input.nextLine();

        if(str1 == str2){
            System.out.println("Strings are equal (ignoring case)");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}