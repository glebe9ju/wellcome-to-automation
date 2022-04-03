package automationtest;

import java.lang.reflect.Constructor;
/*
Question:2 - Marks:5
2.1 Create the class with the name "Variable_Q2"
2.2 Declare two global variables with the name "id" and "name" with int and string type.
2.3 Create a parameterized Constructor That assigns the value of the above two variables.
2.4 Create a method with no return type no parameter with name "display" and write a SOUT statement to print the value of the above variables.
2.5 Create the main method
2.6 Create the Object with name obj1 and pass the value '101', 'YourName'
2.7 Call the 'display method into the main method with obj1.
2.8 Create the second Object with name obj2 and pass the value '102', 'Prime'
2.9 Call the 'display method into the main method with obj2.
OutPut
101 - YourName
102 - Prime
 */

public class Variable_Q2 {
    int id;
    String name;

    public Variable_Q2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " - " + name);

    }

    public static void main(String[] args) {
        Variable_Q2 obj1 = new Variable_Q2(101, "Hetal");
        obj1.display();
        Variable_Q2 obj2 = new Variable_Q2(102,"Prime");
        obj2.display();

    }
}
