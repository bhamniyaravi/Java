import java.util.Scanner;

public class InvertRotatedNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Upto you want to print: ");
        int n = sc.nextInt();

        for(int i = n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
