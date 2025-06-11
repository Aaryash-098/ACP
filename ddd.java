import java.util.ArrayList;

class ddd {
    public static void main(String[] args) {
        ArrayList<String> Humans = new ArrayList<String>();

    Humans.add("Aaryash");
    Humans.add("Kanav");
    Humans.add("Pranit");
    Humans.add("Avya");
    System.out.println(Humans);

    Humans.forEach(n -> {
        if (n == "Aaryash")
            System.out.println("Found the name");
    });


}
}