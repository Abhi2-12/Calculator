import java.util.Scanner;
public class Calculator{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double num1 = input.nextDouble();

        System.out.print("Enter Second number : ");
        double num2 = input.nextDouble();

        System.out.println(" Choose Operation : ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int choice = input.nextInt();

        double result;

        switch (choice) {

            case 1:
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case 4:
                result = num1 / num2;
                System.out.println("Resilt = " + result);
                break;

            default:
                System.out.println("Invalid choice");
        }
        input.close();

    }
}