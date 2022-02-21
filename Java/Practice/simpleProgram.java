import java.util.Scanner;

public class simpleProgram{
    public static void main(String []argh){
        
        Scanner in = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        int n = 0;
        int t = in.nextInt();
       
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
        
        }

        int s0;
        s0 = a + b;
        System.out.print(s0);
        int count,p=1,s,sum=0;
        int total = 0;
        for(int i=0;i<n;i++)
        {
            for(count=1;count<n;count++)
            {
                p = p * 2;
                s = p*b;
                sum = sum + s;
                total = sum + s0;
            }
            System.out.printf("%d,",total);
        }
    }
}