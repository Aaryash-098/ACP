public class ACP {
    
}
class mindriddler {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Uninary operator" + (++a));
        System.out.println("Uninary operator" + (b++));
        System.out.println("Binary operator" + (b+a));
        int c = (a > b)?a : b;
        System.out.println("Ternary operator" + (c));

    }

}