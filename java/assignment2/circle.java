package assignment2;
import java.util.Scanner;

public class Circle {

		    double radius;
		    double diameter;
		    double area;
		    
		 
		    public Circle(double radius) {
		        this.radius = radius;
		    }
		    
		  
		    public void calculateDiameter() {
		        diameter = radius * 2;
		        System.out.println("Diameter of the circle is: " + diameter);
		    }
		    
		   
		    public void calculateArea() {
		        area = Math.PI * radius * radius;
		        System.out.println("Area of the circle is: " + area);
		    }
		    
		 
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the radius of the circle: ");
		        double radius = scanner.nextDouble();
		        Circle circle = new Circle(radius);
		        circle.calculateDiameter();
		        circle.calculateArea();
		        scanner.close();
		    }
		}


	


