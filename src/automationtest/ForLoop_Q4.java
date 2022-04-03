package automationtest;
/*
Question:4 - Marks:4
4.1 Create the class with the name "ForLoop_Q4"
4.2 Create a method with the name "printMyName" with no return type and two parameters with the type string and name
    "name" and int type name 'howManyTime'.
4.3 Write the for loop into the "printMyName '' method which prints your name depending upon howManyTime's value.
4.4	Create the main method
4.5 Create the Object and call the 'printMyName' method into the main method.

OutPut
howManyTime = 10 it will print your name 10 times
howManyTime = 15 it will print your name 15 times
 */

import java.util.Scanner;

public class ForLoop_Q4 {
    public void printMyName(String name, int howManyTime) {
        for (int i = 0; i < howManyTime; i++) {
            System.out.println("My name is  " + name);
        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 myName = new ForLoop_Q4();
        myName.printMyName("Hetal", 10 );
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter your name : " );
        String name= scr.nextLine();
        System.out.print("Enter how many time : ");
        int time = scr.nextInt();
        myName.printMyName(name,time);

    }
}
