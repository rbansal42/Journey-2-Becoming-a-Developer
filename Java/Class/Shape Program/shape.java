import java.util.Scanner;
import java.lang.Math;

abstract class Shape {
    
    float d1;

    abstract public void area();
    abstract public void perimeter();

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public float getD1() {
        return d1;
    }

}

class square extends Shape{

    public void area() {

        float a = d1 * d1;
        System.out.println("The area of the square is: " + a);
    }

    public void perimeter(){

        float p = d1 * 4;
        System.out.println("The perimter of the square is " + p);
    }

}

class rectangle extends Shape{

    float d2;

    public void area() {

        float a = d1 * d2;
        System.out.println("The area of the rectangle is: " + a);
    }

    public void perimeter(){

        float p = 2 * (d1 + d2);
        System.out.println("The perimter of the rectangle is " + p);
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    public float getD2() {
        return d2;
    }
}

class circle extends Shape{

    public void area() {

        float a = (22/7) * d1 * d1;
        System.out.println("The area of the circle is: " + a);
    }
    
    public void perimeter(){
        
        float p = 2 * (22/7) *  d1;
        System.out.println("The perimter of the circle is " + p);
    }

}
