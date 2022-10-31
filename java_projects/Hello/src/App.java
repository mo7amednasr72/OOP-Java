// import Hello.Car; // package is Hello and the module or the class here is Car class == module in java
import Hello.*;

public class App {
    public static void main(String[] args) throws Exception {
        

        Car car1 = new Car();
        Car car2 = new Car();

        car1.setMaker("Honda");
        car1.setModel(1202);
        car2.setMaker("Toyota");
        car2.setModel(1423);
        System.out.println(car1.getMaker());
        System.out.println(car2.getMaker());
        System.out.println("------------------------------------------------");
        // --------------------------------------------------------------------
        Rectangle r1 = new Rectangle(); // we used the default constructor here
        r1.setLength(100);
        r1.setWidth(800);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println("------------------------------------------------");
        // --------------------------------------------------------------------
        Rectangle r2 = new Rectangle(30, 50);
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        System.out.println("------------------------------------------------");
        // --------------------------------------------------------------------
        Employee emp1 = new Employee();
        emp1.printemployeeData();
        System.out.println("No of employees are "+ Employee.getNo_of_employees());
        System.out.println("------------------------------------------------");
        // --------------------------------------------------------------------
        Employee emp2 = new Employee(200, "Ahmed", true);
        emp2.printemployeeData();
        System.out.println("No of employees are "+ Employee.getNo_of_employees());
        System.out.println("------------------------------------------------");
        // --------------------------------------------------------------------
        Employee emp3 = new Employee(1500, "Mohamed Nasr", "HR", 10000, 2000, true);
        emp3.setSalary(12000, 6000);
        emp3.printemployeeData();
        System.out.println("No of employees are "+ Employee.getNo_of_employees());
    }
    
    
    
    
} 


