import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Welcome to shapes program.");
        System.out.println("Which shape are you dealing with?");
        System.out.println("\n1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle\n");
        
        System.out.print("Option: ");
        int choice = s.nextInt();
        

        do {
            
            switch (choice) {
                case 1:
                
                    square square1 = new square();
                    
                    System.out.println("Square program...");
                    System.out.print("Enter length: ");
                    square1.setD1(s.nextFloat());

                    System.out.println("What do you want to find?");
                    System.out.println("1. Area");
                    System.out.println("1. Perimeter");
                    int choice1 = s.nextInt();

                    if (choice1 == 1) {
                        square1.area();
                    }
                    else if (choice1 == 2) {
                        square1.perimeter();
                    }
                    else
                        System.out.println("Invalid Input");
                        
                        
                    choice = 0;
                    
                    break;
                    
                    case 2:
                    
                    rectangle rectangle1 = new rectangle();
                    
                    System.out.println("Rectangle program...");
                    System.out.print("Enter length: ");
                    rectangle1.setD1(s.nextFloat());
                    
                    System.out.print("\nEnter breadth: ");
                    rectangle1.setD2(s.nextFloat());
                    
                    System.out.println("What do you want to find?");
                    System.out.println("1. Area");
                    System.out.println("2. Perimeter");
                    choice1 = s.nextInt();
                    
                    if (choice1 == 1) {
                        rectangle1.area();
                    }
                    else if (choice1 == 2) {
                        rectangle1.perimeter();
                    }
                    else
                    System.out.println("Invalid Input");
                    
                    
                    choice = 0;
                    break;
                    
                    case 3:
                
                    circle circle1 = new circle();
                    
                    System.out.println("Circle program...");
                    System.out.print("Enter readius: ");
                    circle1.setD1(s.nextFloat());
                    
                    System.out.println("What do you want to find?");
                    System.out.println("1. Area");
                    System.out.println("2. Perimeter");
                    choice1 = s.nextInt();
                    
                    if (choice1 == 1) {
                        circle1.area();
                    }
                    else if (choice1 == 2) {
                        circle1.perimeter();
                    }
                    else
                        System.out.println("Invalid Input");
                     
                    choice = 0;
                    break;

                default:
                    break;
            }

        } while (choice != 0);

    }
}
