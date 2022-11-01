package Hello;

public class Person {
    protected String name;
    protected double age;
    protected String address;
    protected String nationality;

    public Person() {

    }

    public Person(String name, double age, String address, String nationality) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.nationality = nationality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void printAllDetails() {
        System.out.println("Person name is "+ this.name);
        System.out.println("Person address is "+ this.address);
        System.out.println("Person age is "+this.age);
        System.out.println("Person nationality is "+this.nationality);      
    }
}
