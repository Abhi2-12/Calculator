import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b){
        return a + b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a,double b){
        return a * b;
    }

    public static double divide(double a ,double b){
        return a / b;
    }

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {

             System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int choice = input.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1,num2);
                break;

            case 2:
                result = subtract(num1,num2);
                break;
            
            case 3:
                result = multiply(num1,num2);
                break;

            case 4:
                result = divide(num1,num2);
                break;

            default:
                System.out.println("invalid !!");
        }

        System.out.println(" Result : " + result);

        //asking user to continue

        System.out.println("continue ? yes / no : ");
        String again = input.next();

        if(again.equalsIgnoreCase("no")) {
            running = false;
            System.out.println("Calculator closed....");
        }
        
        }

        input.close();

    }
}