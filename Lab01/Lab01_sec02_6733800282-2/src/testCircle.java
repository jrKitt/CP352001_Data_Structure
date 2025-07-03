import java.util.Scanner;

public class testCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = null;

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Create New Circle");
            System.out.println("2. Find Area");
            System.out.println("3. Find circumference");
            System.out.println("4. Find volume");
            System.out.println("5. My Radius");
            System.out.println("6. Exit");
            System.out.print("Please choose menu (1 – 6): ");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    circle = new Circle(radius);
                    System.out.println("circle created");
                    break;
                case 2:
                    if (circle != null) {
                        System.out.println("Area: " + circle.area());
                    } else {
                        System.out.println("enter your area.");
                    }
                    break;
                case 3:
                    if (circle != null) {
                        System.out.println("Circumference: " + Circle.circumference());
                    } else {
                        System.out.println("please create circle.");
                    }
                    break;
                case 4:
                    if (circle != null) {
                        System.out.println("Volume: " + Circle.volume());
                    } else {
                        System.out.println("please create circle.");
                    }
                    break;

                case 5:
                    if (circle != null) {
                        System.out.println("Current Radius: " + circle.getRadius());
                    } else {
                        System.out.println("please create circle.");
                    }
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Please choose menu (1 – 6) :");
                    break;
            }
        }
    }
}