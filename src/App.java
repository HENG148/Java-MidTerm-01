import java.sql.Date;
import java.util.Scanner;

import DateConverter.DateConverter;
import SquareAndRectangle.*;

public class App {
    public static void main(String[] args) {
        double width = 5;
        double length = 10;
        double side = 7;
        Rectangle rectangle = new Rectangle(side, side);
        Square square = new Square(side);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Convert short date to full date");
        System.out.println("2. Area and perimeter of a rectangle");
        System.out.println("3. Area and perimeter of a square");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                DateConverter.main(args);
                break;
                
            case 2:
                System.out.println("Rectangle: width= "+width+" "+"length= "+length+" "+"side= "+side);
                System.out.println("Area: " + rectangle.getArea());
                System.out.println("Perimeter: " + rectangle.getPerimeter());
                break;
            case 3:
                System.out.println("\nSquare: width= "+width+" "+"length= "+length+" "+"side= "+side);
                System.out.println("Area: " + square.getArea());
                System.out.println("Perimeter: " + square.getPerimeter());
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        scanner.close();

    }

    private String getArea() {
        return null;
    }

    private String getPerimeter() {
        return null;
    }
}