import java.lang.Math;

public class euclidianDistance {
    
    public static void main(String[] args) {
        
        Point p1 = new Point();
        Point p2 = new Point(1, 2, 3);
        float dis = p1.findDistance(p2);

        p1.display();
        p2.display();

        System.out.println("Distance: " + dis);

    }

}


class Point{

    int x, y, z;

    Point(){
    }

    Point(int pointX, int pointY, int pointZ) {

        x = pointX;
        y = pointY;
        z = pointZ;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public float findDistance(Point p){

        float dist = Math.sqrt(((x * x) + (p.x * p.x) - (2 * x * p.x)) + 
            ((y * y) + (p.y * p.y) - (2 * y * p.y)) + 
            ((z * z) + (p.z * p.z) - (2 * z * p.z)));

        return dist;
    }
    
    public float findDistance(int PointX, int PointY, int PointZ){

        

        float dist = Math.sqrt(((x * x) + (PointX * PointX) - (2 * x * p.x)) + 
            ((y * y) + (p.y * p.y) - (2 * y * p.y)) + 
            ((z * z) + (p.z * p.z) - (2 * z * p.z)));

        return dist;
    }
    

    void display(){

        System.out.printf("x is %d", x);
        System.out.printf("y is %d", y);
        System.out.printf("z is %d", z);

    }

}