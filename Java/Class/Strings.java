class Strings {
    
/*
Program to get strings in user input as objects
*/

    public static void main(String args[]) {

        student S1 = new student();
        student S2 = new student();

        S1.setName("Rahul");
        S1.setName("Oorja");

        System.out.println("Name 1 is: " + S1.getName());
        System.out.println("Name 1 is: " + S2.getName());

    }

    public class student {

        String name;

        public void setName(String n) {

            name = n;
        }

        public String getName() {
            return(name);
        }
    }

}