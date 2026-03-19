import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;

public class Calculator{

    //basic operation 
    public static double add(double a,double b){
        return a + b;
    }

    public static double Subtract(double a, double b){
        return a - b;
    }

     public static double multiply(double a,double b){
        return a * b;
    }

    public static double divide(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Cant divide by zero");
        }
        return a / b;
    }

    //main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("Crash Proof Calculator");

        while (running) {
            double num1 = 0,num2 = 0;

            //First number safety

            while (true) {
                try {
                    System.out.println("Enter 1st number");
                    num1 = input.nextDouble();
                    break;  //exit if valid
                } catch (InputMismatchException e) {
                    // TODO: handle exception
                    System.out.println("Invalid input please input any number ");
                    input.next();  ///clear invalid input
                }
                
            }
            

            //2nd number safty
            while (true) {
                try {
                    System.out.println(" Enter 2nd number : ");
                    num2 = input.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    // TODO: handle exception
                    System.out.println(" Invalid ");
                    input.next();
                }
                
            }

            //Chose Operation
            System.out.println("Choose Operation");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");

            int choice = 0;

            while (true) {
                try {
                    choice = input.nextInt();
                    if (choice < 1 || choice > 4) {
                        System.out.println("Invalid input..press 1 to 4");
                        continue;     
                    }
                    break; //valid choice  
                } catch (InputMismatchException e) {
                    // TODO: handle exception
                    System.out.println("nvalid input..press 1 to 4");
                    input.next(); //clear invalid input
                }   
            }

            //Calculation
            double result = 0;
            try {
                switch (choice) {
                    case 1 -> result = add(num1, num2);
                    case 2 -> result = Subtract(num1, num2);
                    case 3 -> result = multiply(num1, num2);
                    case 4 -> result = divide(num1, num2);   
                }

                System.out.println("result : " + result);
            
            } catch (ArithmeticException e) {
                // TODO: handle exception
                System.out.println(e.getMessage());

            }

            //Loop
            System.out.println("Do you want to continue : yes / no");
            String again = input.next();
            if ( again.equalsIgnoreCase("no")){
                running = false;
                System.out.println(" Calculator Close");
            }

        }
        input.close();
    }


}