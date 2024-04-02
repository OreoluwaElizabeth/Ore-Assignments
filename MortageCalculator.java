import java.util.Scanner;

  public class MortageCalculator {

    public static void main(String [] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Enter principal: ");
      int principal = input.nextInt();

     System.out.println("Enter the annual intrest rate: ");
      double intrestRate = input.nextDouble();

    System.out.println("Enter the duration in years:");
     double duration = input.nextDouble();

    double numOfYears = 12 * duration;
    double rate = intrestRate/100;
    double monthlyRate = rate/12;
    double monthBase = 1 + monthlyRate;
    double base = Math.pow(monthBase , numOfYears);
    double number1 = (principal * monthlyRate);
    double number2 = (base - 1);
    double monthlyPayment = number1 * base / number2;

    System.out.printf("The monthly payment is %.2f " , monthlyPayment);
      
}
}










