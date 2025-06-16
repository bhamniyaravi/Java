import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("The 1st number: " +a);
        System.out.println("The 2nd number: " +b);

        int sum = a + b;
        int sub = a - b;
        float multiply = a*b;
        double div = (double)a/b;

        System.out.println("Sum:" +sum);
        System.out.println("Subtract: " +sub);
        System.out.println("Multiply: " +multiply);
        System.out.println("Division: " +div);
    }
}
