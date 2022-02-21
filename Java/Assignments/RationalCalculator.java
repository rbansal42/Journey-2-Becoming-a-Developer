public class RationalCalculator {
    
    public static void main(String[] args) {

        Rational r1 = new Rational(2, 5);
        Rational r2 = new Rational(3, 5);
        Rational r3 = new Rational();

        r3 = r1.getAdd(r2);
        r3.display();

    }

}

class Rational {

    int numerator , denomenator;

    Rational(){

    }

    Rational(int num, int den){

        numerator = num;
        denomenator = den;

    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenomenator() {
        return denomenator;
    }

    public void setDenomenator(int denomenator) {
        this.denomenator = denomenator;
    }

    public void display(){
        System.out.println(numerator + "/" + denomenator);
    }

    public Rational getAdd(Rational r){

        Rational rTemp = new Rational();

        rTemp.numerator = (numerator * r.denomenator) + (r.numerator * denomenator);
        rTemp.denomenator = denomenator * r.denomenator;
        
        return rTemp;
    }
    
    public Rational getSub(Rational r){
        
        Rational rTemp = new Rational();
        
        rTemp.numerator = (numerator * r.denomenator) - (r.numerator * denomenator);
        rTemp.denomenator = denomenator * r.denomenator;

        return rTemp;
    }

    public Rational getMul(Rational r){

        Rational rTemp = new Rational();

        rTemp.numerator = numerator * r.numerator;
        rTemp.denomenator = denomenator * r.denomenator;

        return rTemp;
    }

    public Rational getDiv(Rational r){

        Rational rTemp = new Rational();

        rTemp.numerator = numerator * r.denomenator;
        rTemp.denomenator = denomenator* r.numerator;

        return rTemp;
    }

    public Rational reduce(){

        Rational rTemp = new Rational();
        int temp = denomenator;     // temp should be the lower of the 2 numbers
        int maxF = 0;                   // maxF will represent the HCF of the 2 numbers
        
        if (numerator < denomenator) {

                temp = numerator;
            
        }

        for(int i = 1; i<=temp; i++){

            if(numerator % i == 0 && denomenator % i == 0) {

                maxF = i;

            }

        }

        rTemp.numerator = numerator / maxF;
        rTemp.denomenator = denomenator / maxF;
        
        return rTemp;

    }

}