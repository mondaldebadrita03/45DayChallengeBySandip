// Calculation of Sum of digits
import java.util.Scanner;
class DigitSum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long x = sc.nextLong(); 
        long y = x;  
        long sum = 0;  
        while(y != 0){
            sum += y % 10;
            y /= 10;
        }
        System.out.println("The sum of the digits of the number " + x + " is " + sum);
    }
}