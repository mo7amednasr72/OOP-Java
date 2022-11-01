// import Hello.Car; // package is Hello and the module or the class here is Car class == module in java
// import java.util.Scanner;

import Hello.*;

// note that javac stand for java compiler to compile the source code to Byte code and this is the process 1
// java is the interpreter to interpret from the byte code to machine code using the virtual machine in this process
// and because a virtual machine can always handle the byte code hence you can just send your Byte code to your friend without the source code
public class App {
    public static void main(String[] args) throws Exception {
        // Scanner input = new Scanner(System.in); // not that input is an object and Scanner after new is a constructor that have System.in as an argument and in means to enter a value from the terminal
        // int x = input.nextInt(); // for enter an int value and nextInt() is a method in the input object
        // String str = input.next(); // to enter a string value and next() is a method in the input object
        // char chr = input.next().CharAt(0);
        // float xf = input.nextFloat();

        // Car car1 = new Car();
        // Car car2 = new Car();

        // car1.setMaker("Honda");
        // car1.setModel(1202);
        // car2.setMaker("Toyota");
        // car2.setModel(1423);
        // System.out.println(car1.getMaker());
        // System.out.println(car2.getMaker());
        // System.out.println("------------------------------------------------");
        // // --------------------------------------------------------------------
        // Rectangle r1 = new Rectangle(); // we used the default constructor here
        // r1.setLength(100);
        // r1.setWidth(800);
        // System.out.println(r1.getLength());
        // System.out.println(r1.getWidth());
        // System.out.println("------------------------------------------------");
        // // --------------------------------------------------------------------
        // Rectangle r2 = new Rectangle(30, 50);
        // System.out.println(r2.getLength());
        // System.out.println(r2.getWidth());
        // System.out.println("------------------------------------------------");
        // // --------------------------------------------------------------------
        // Employee emp1 = new Employee();
        // emp1.printemployeeData();
        // System.out.println("No of employees are "+ Employee.getNo_of_employees());
        // System.out.println("------------------------------------------------");
        // // --------------------------------------------------------------------
        // Employee emp2 = new Employee(200, "Ahmed", true);
        // emp2.printemployeeData();
        // System.out.println("No of employees are "+ Employee.getNo_of_employees());
        // System.out.println("------------------------------------------------");
        // // --------------------------------------------------------------------
        // Employee emp3 = new Employee(1500, "Mohamed Nasr", "HR", 10000, 2000, true);
        // emp3.setSalary(12000, 6000);
        // emp3.printemployeeData();
        // System.out.println("No of employees are "+ Employee.getNo_of_employees()); // call it by class and this is what happened when you call any method form any class without creating object from it this method will be static
    
        Student st1 = new Student("Mohamed Nasr", 23, "Cairo", "Egyption", 5, 3.9, "SWE");
        st1.printAllDetails();
    }
    
    
    
    
} 


