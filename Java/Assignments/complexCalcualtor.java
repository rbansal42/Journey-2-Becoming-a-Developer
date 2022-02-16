import java.util.Scanner;
import java.lang.Math;

public class complexCalcualtor {
    
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This is a Complex Number calculator.");
        System.out.println("Enter 2 variables:");
        
        // Declaring complex numbers
        complex c1 = new complex();
        complex c2 = new complex();
        
        // Taking input for Complex 1
        System.out.println("For complex number 1, enter:");
        System.out.print("Real number: ");
        c1.setReal(scan.nextInt());
        System.out.print("Imaginary number: ");
        c1.setImag(scan.nextInt());
        
        // Taking input for Complex 2
        System.out.println("\nFor complex number 2, enter:");
        System.out.print("Real number: ");
        c2.setReal(scan.nextInt());
        System.out.print("Imaginary number: ");
        c2.setImag(scan.nextInt());
        
        // Displaying inputs for complex 1
        System.out.println("c1 is " + c1.real + " + " + c1.imag + "i");
        
        // Displaying inputs for complex 2
        System.out.println("\nc2 is " + c2.real + " + " + c2.imag + "i");

        System.out.println("\nChoose your option: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Absolute");
        System.out.println("5. Exit\n");

        System.out.print("Your input: ");
        int input = scan.nextInt();

        switch (input) {
            case 1: //Add
                c1.getAdd(c2);
                break;

            case 2: //Subtract
                c1.getSub(c2);
                break;
            
            case 3: //Multiply
                c1.getMulti(c2);
                break;
            
            case 4: //Absolute
                
                System.out.println("Which complex number do you want to find the value of: 1 or 2?");
                int c1ORc2 = scan.nextInt();

                if(c1ORc2 == 1) {
                    c1.getAbsolute();
                }

                else if(c1ORc2 == 2) {
                    c2.getAbsolute();
                }

                else{
                    System.out.println("Invalid Input.");
                }

                break;
            
            default:
                break;
        }

    }

}

class complex {

    int real, imag;

    public int getReal() {
        return real;
    }

    public int getImag() {
        return imag;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    public void getAdd(complex c) {
        complex c_out = new complex();

        c_out.imag = c.imag + imag;
        c_out.real = c.real + real;

        System.out.println("Sum is " + c_out.real + " + " + c_out.imag + "i");
    }
    
    public void getSub(complex c) {
        complex c_out = new complex();
        
        c_out.real = c.real - real;
        c_out.imag = c.imag - imag;
        
        System.out.println("Difference is " + c_out.real + " - " + c_out.imag + "i");
        
    }
    
    public void getMulti(complex c) {
        complex c_out = new complex();
        
        c_out.imag = c.imag * imag;
        c_out.real = c.real * real;
        
        System.out.println("Product is " + c_out.real + " * " + c_out.imag + "i");
        
    }
    
    public void getAbsolute() {
        
        int absolute = ((real*real) + (imag*imag));
        System.out.println("Absolute value is: " + Math.sqrt(absolute));

    }

    public void printComplex(complex c) {
        System.out.println("Real = " + c.getReal());
        System.out.println("Imag = " + c.getImag());
    }
}