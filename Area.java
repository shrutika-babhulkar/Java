/*Implement java to print the area of a rectangle by creating a class named 'Area' having two
methods. First method named as 'setDim' takes length and breadth of rectangle as
parameters and the second method named as 'getArea' returns the area of the rectangle.
Length and breadth of rectangle are entered through keyboard.*/

import java.util.Scanner;

class Area {
    double length, breadth;

    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        
        Area rect = new Area();
        rect.setDim(length, breadth);
        
        System.out.println("Area: " + rect.getArea());
        
        sc.close();
    }
}
