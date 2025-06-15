package BasicsOfJava;

public class MultipleVariables {
    public static void main(String[] args) {
        int x = 5,y = 8,z = 9;
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);
        z = 10;
//        value update kardi
        z = x / y;
//        aise bhi ikh skte h diff operators k sath
        System.out.println("The value of x is "+z);
        System.out.println("Mast cheez "+x+y+z);
//    left right check krta h computer to "" iske baad jo bhi hoga usko text considered krta h
        System.out.println(x+y+""+z);
//        vohi left to right but phle add then text
    }
}
