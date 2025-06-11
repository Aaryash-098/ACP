import java.util.Scanner;

class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 2 numbers");
            float y = sc.nextFloat();
            float x = sc.nextFloat();
            float z =  x / y ;
            System.out.println("The answer is " + z);
        }
        catch(ArithmeticException ex) {
            System.out.println("_______");
            System.out.println(ex);
        }
        finally {
            System.out.println("_______");
            sc.close();
        }
    }
}