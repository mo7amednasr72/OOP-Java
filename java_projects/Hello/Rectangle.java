package Hello;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 10;
        width = 15;
        System.out.println("The default constructor is called and a new rectangle is created with 10 m length and 15 m width.");
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("The parameterized constructor is called.");
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

}
