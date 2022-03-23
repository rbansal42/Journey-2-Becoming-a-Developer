import java.util.Scanner;

/*
Program to scan user input
*/


class scan{
    
    public static void main (String args[]) {

        Scanner myScan = new Scanner(System.in);

        student S1 = new student();
        student S2 = new student();

        System.out.println("Enter name: ");
        String nm = myScan.nextLine();

        S1.setName(nm);
        S2.setName("Oorja");

        System.out.println("Name 1 is: " + S1.getName());
        System.out.println("Name 2 is: " + S2.getName());

    }
}

    class student {

        String name;

        public void setName(String n) {

            name = n;
        }

        public String getName() {
            return(name);
        }
    }

    
