class ACP3 { 
    int san;
    String name;
    float gra;

    ACP3() {
        System.out.println("***");
        san = 101;
        name = "Aaryash";
        gra = 91;
    }

    void displaydetails() {
        System.out.println(san + " " + name + " " + gra);
    }
}
class ACP31 {
    public static void main(String[] args) {
    ACP3 E1 = new ACP3();
    
    E1.displaydetails();
    
    }
}