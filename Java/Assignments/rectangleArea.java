// Write a function class that outputs the area of a rectangle

import java.util.Scanner;

public class rectangleArea {
    
    public static void main (String args[]) {

        Scanner myScan = new Scanner(System.in);

        // Declaring 2 variables with Rectangle class

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        // For Rectangle 1
        
        System.out.println("For Rectangle 1,");
        
        System.out.print("Enter Length: ");
        int l1 = myScan.nextInt();
        r1.setLength(l1);
        
        System.out.print("Enter Height: ");
        int h1 = myScan.nextInt();
        r1.setHeight(h1);
        
        // For Rectangle 2
        
        System.out.println("For Rectangle 2,");
        
        System.out.print("Enter Length: ");
        int l2 = myScan.nextInt();
        r2.setLength(l2);
        
        System.out.print("Enter Height: ");
        int h2 = myScan.nextInt();
        r2.setHeight(l2);
        
        // Comparision for larger rectangle based on area and printing the larger

        if (r1.getArea() > r2.getArea()) {

            System.out.println("Rectangle 1 is greater.");
        }
        else if (r2.getArea() > r1.getArea()) {

            System.out.println("Rectangle 2 is greater.");
        }
        
        else {
            System.out.println("Both rectangles have equal are.");
        }


    }
}



class Rectangle {

    int Length;
    int Height;
    int Area;

    public void setLength(int n) {

        Length = n;
    }
    public void setHeight(int n) {

        Height = n;
    }

    public int getArea() {

        Area = Length * Height;
        return Area;

    }
}


