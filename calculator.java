//This project will be focussed on making a caluclator using switch cases. It will be able to add and subtract to begin with.
//This is also a test for importing functions like scanner.
//REMEMBER, after every addition of code, you MUST compile (javac calculator.java) before running the code (java calculator)
//REMEMBER, import the right functions to help with code.

import java.util.*;
import java.util.Scanner;

public class calculator {
  public static void main(String[] args){

    System.out.println("Welcome to my first Java App, it's a calulator (surprise, surprise)! Follow the instructions to do basic calulations. Input your first and second number");
    Scanner input=new Scanner(System.in);
    Double num1,num2;
    num1=input.nextDouble();
    num2=input.nextDouble();
    System.out.println("You have chosen " + num1 + " and " + num2);
    Double ans;

    System.out.println("Next, you must choose the operation you want to perform on these two numbers, choose 1 for addition, 2 for subtraction, 3 for multiplcation or 4 for division");

    Scanner inp=new Scanner(System.in);
    int operation;
    operation=inp.nextInt();
      switch (operation){
      case 1:
        System.out.println("You choose Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        break;
      case 2:
        System.out.println("You choose Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        break;
      case 3:
        System.out.println("You have chosen Multiplcation: " + num1 + " x " + num2 + " = " + (num1 * num2));
        break;
      case 4:
        System.out.println("You have chosen Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
        break;
      default:
        System.out.println("DON'T DO THAT SILLY");
      }


  }
}
