import java.util.Scanner;

public class SquareRoot{

  public static void main(String [] args) {

   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter a value for D:");
   double D = scanner.nextDouble();

   double C = 50;
   double H = 30;

   double Q = Math.sqrt((2 * C * D) / H);

   System.out.printf("The value of Q is: %.2f\n" , Q);
   
   }

}