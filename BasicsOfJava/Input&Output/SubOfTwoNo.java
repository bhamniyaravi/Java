import java.util.Scanner;

public class SubOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number: ");
        int a = sc.nextInt();
        System.out.println("Your First number is: " +a);

        System.out.println("Enter your Second number: ");
        int b = sc.nextInt();
        System.out.println("Youe Second number is: " +b);

        int subtract = a - b;
        System.out.println("Subtrat: " +subtract);

    }
}
