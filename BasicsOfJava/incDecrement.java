package BasicsOfJava;

public class incDecrement {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
//        phle 5 tha phir inc. hoke 6 hua phir dec. hoke 5 hua
        int y = 9;
        System.out.println(++x);
        System.out.println(x);
//        x++ is "use and then increment"
//        ++x is "increment x and then use"
    }
}
