import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;

        System.out.println("Enter Your age: ");
        age = sc.nextInt();

        while(age<0){
            System.out.println("your age can't be negative");
            System.out.println("Enetr your age: ");
            age = sc.nextInt();
        }
        System.out.println("You are " + age + " years old");

        sc.close();
    }
}