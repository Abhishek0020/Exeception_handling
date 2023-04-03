import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter two number : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("div : " + (a / b));
        }
        catch (ArithmeticException e){
            System.out.println("Inside ArithmeticException catch block :  ");
            System.out.println("enter the non-zero divisor : ");
        }
        catch (InputMismatchException e){
            System.out.println("inside InputMismatchException catch block : ");
            System.out.println("give the proper input : ");
        }
        catch (Exception e){
            System.out.println("inside yhe exception block : ");
        }
        System.out.println("end of the program :");
    }
}
