import java.util.ArrayList;

class array {
    public static void main(String[] args) {
        System.out.println("Numbers");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.sort(null); 
        System.out.println(numbers);
    }
}