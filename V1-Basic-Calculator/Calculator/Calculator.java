import java.util.Scanner;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        double num1 = input.nextDouble();

        System.out.println("Enter Second Number : ");
        double num2 = input.nextDouble();

        System.out.println("Numbr intered " + num1 + "  " + num2);

        System.out.println("Choose operation : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = input.nextInt();

        double result = 0;

        if (choice == 1){
            result = num1 + num2;
        }else if (choice == 2){
            result = num1 - num2;
        }else if (choice == 3){
            result = num1 * num2;
        }else if (choice == 4){
            result = num1 / num2;
        }else {
            System.out.println("Invalid");
        }
        System.out.println("Result = " + result);



    }
}