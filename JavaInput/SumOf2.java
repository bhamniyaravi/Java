package JavaInput;
import java.util.Scanner;

public class SumOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();

        int sum = x + y;
        System.out.println("Sum: "+sum);
    }
}
