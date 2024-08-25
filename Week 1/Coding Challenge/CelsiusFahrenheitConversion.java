// Celsius to Fahrenheit and Fahrenheit to Celsius converter
import java.util.Scanner;
class CelsiusFahrenheitConversion{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("                 << M E N U >>                ");
            System.out.println("1.Convert Celsius to Fahrenheit");
            System.out.println("2.Convert Fahrenheit to Celsius");
            System.out.println("3.Exit the program");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("Enter the temperature in Celsius:");
                    double celsius = sc.nextDouble();
                    double fahrenheit = 9.0/5.0 * celsius + 32;
                    System.out.println("Hence , the temperature " + celsius + " celsius is equivalent to " + fahrenheit + " fahrenheit");
                    break;

                case 2: 
                    System.out.println("Enter the temperature in Fahrenheit:");
                    fahrenheit = sc.nextDouble();
                    celsius = (fahrenheit - 32) * 5.0/9.0;
                    System.out.println("Hence , the temperature " + fahrenheit + " fahrenheit is equivalent to " + celsius + " celsius");
                    break;

                case 3:
                    System.out.println("Exiting the program\n___________________________________");
                    break;
                
                default:
                    System.out.println("Invalid input!\nTry again with a valid input!");
            }

        } while(choice != 3);
    }
}