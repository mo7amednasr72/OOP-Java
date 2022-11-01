package Hello;

public class Student extends Person { // inheritance from class Person
    
    private int studyLevel;
    private double GPA;
    private String specialization;
    
    public Student() {

    }

    public Student(String name, double age, String address, String nationality, int studyLevel, double GPA, String specialization) {
        super(name, age, address, nationality); // base class constructor you call it because it's not inherited in inheritance
        this.studyLevel = studyLevel;
        this.GPA = GPA;
        this.specialization = specialization;
    }

    public int getStudyLevel() {
        return studyLevel;
    }
    public void setStudyLevel(int studyLevel) {
        this.studyLevel = studyLevel;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gPA) {
        GPA = gPA;
    }

    @Override // this notation is not mandatory it's optional to write but it's useful to notice that there's overriding here
    // note that overriding and overloading both are types of polymorphism video 16 is very important about that point
    public void printAllDetails() {
        // super.printAllDetails(); // you can do this 
        System.out.println("Student name is "+ this.name);
        System.out.println("Student address is "+ this.address);
        System.out.println("Student age is "+this.age);
        System.out.println("Student nationality is "+this.nationality);
        System.out.println("Student study level is "+this.studyLevel);
        System.out.println("Student GPA is "+this.GPA);
        System.out.println("Student specialization is "+this.specialization);
    }
}
