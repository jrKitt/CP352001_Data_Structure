
//@author กิตติชัย รักษาวงค์ sec02 673380028-2

public class Circle {
    private static double radius;

    Circle (double radius) {
        Circle.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        Circle.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public static double circumference(){
        return 2 * Math.PI * radius;
    }

    public static double volume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

}
