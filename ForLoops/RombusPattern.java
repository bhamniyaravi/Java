public class RombusPattern {
    public static void main(String[] args) {

        int n = 5; // Size of the rhombus

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



