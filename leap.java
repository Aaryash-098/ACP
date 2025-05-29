import java.util.Scanner;

class leap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scn.nextInt();
        scn.close();

        if (a % 4 == 0) {
            System.out.println("It is a leap year");
        }

        else {
            System.out.println("it is not a leap year");
        }

    }
}