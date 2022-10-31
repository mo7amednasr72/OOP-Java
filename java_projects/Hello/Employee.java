package Hello;

public class Employee {
    private int id;
    private String name;
    private String depart;
    private double salary;
    private double bonus;
    private boolean resident; // instance attribute
    private static int no_of_employees; // class attribute

    public Employee() { // default constructor
        this.id = 100;
        this.name = "No Name";
        this.salary = 3000;
        this.bonus = 500;
        this.depart = "Not Assigned Yet";
        this.resident = true;
        no_of_employees++;
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        no_of_employees++;
    }
    public Employee(int id, String name, boolean resident) {
        // this.id = id;
        // this.name = name;
        this(id, name); // by this line you can call the consturctor that have these two parameter // this method is called constructor chain
        this.resident = resident;
    }
    public Employee(int id, String name, String depart, double salary, double bonus, boolean resident) {
        // this.id = id;
        // this.name = name;
        this(id, name, resident); // consturctor chain
        this.depart = depart;
        this.salary = salary;
        this.bonus = bonus;
        // this.resident = resident;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepart(String depart) {
        this.depart = depart;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setSalary(double salary, double bonus) { // function overloading
        // this.salary = salary;
        // this.bonus = bonus;
        this.setSalary(salary); // reusability
        this.setBonus(bonus);
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setResident(boolean resident) {
        this.resident = resident;
    } 
    
    public void printemployeeData() {
        System.out.println("employee id is "+ id);
        System.out.println("employee depart is "+ depart);
        System.out.println("employee name is "+ name);
        System.out.println("employee salary is "+ salary);
        System.out.println("employee bonus is "+ bonus);
        if(resident)
        System.out.println("The employee is resident");
        else
        System.out.println("employee is not resident");
    }
    
    public static int getNo_of_employees() { // class method
        return no_of_employees;
    }
}
    