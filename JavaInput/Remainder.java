package JavaInput;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of Divisor: ");
        int b = sc.nextInt();
        if (a>b){
            int q = a / b;
            System.out.println("Quotent: "+q);
            int r = a - (b*q);
            System.out.println("Remainder: "+r);
        }
        else{
            System.out.println("Not Possible");
        }
    }
}
