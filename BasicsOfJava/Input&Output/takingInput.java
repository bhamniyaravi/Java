import java.util.Scanner;


public class takingInput {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter your name = ");
        String name = sc.next();

        sc.nextLine();

        System.out.println("Enter Your university Name = ");
        String university = sc.nextLine();

        System.out.println("Enter your DOB year = ");
        int year = sc.nextInt();

        System.out.println("\nYour Name: " + name);
        System.out.println("Your University: " + university);
        System.out.println("DOB year = " +year);
    }
}
