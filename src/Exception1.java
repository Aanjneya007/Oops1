import java.util.*;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.println("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            c = a/b;
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(c);
        }


    }
}
