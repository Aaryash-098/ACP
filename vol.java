class shape {
    public double getArea() {
        return 0;
    }
}

class rect extends shape {
    private double base;
    private double height;
    private double length;

    public rect(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }

    public double getArea() {
        return base * height * length;
    }
}

class vol {
    public static void main(String[] args) {
        shape[] s = new shape[2];
        s[0] = new rect(5, 10, 7);
        System.out.println("The volume of the rect is " + s[0].getArea());

    }
}