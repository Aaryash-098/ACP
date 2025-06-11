interface Vehicles {
    void SpeedUp(int a);

    void Gear(int a);

    void Brakes(int a);
}

class bike implements Vehicles {
    int Speed;
    int Gear;

    @Override
    public void SpeedUp(int increment) {
        Speed = Speed + increment;
    }

    @Override
    public void Brakes(int decrement) {
        Speed = Speed - decrement;
    }

    @Override
    public void Gear(int NewGear) {
        Gear = NewGear;
    }

    public void printstate() {
        System.out.println("Speed is " + Speed + "Gear is " + Gear);
    }
}

class car implements Vehicles {
    int Speed;
    int Gear;

    @Override
    public void SpeedUp(int increment) {
        Speed = Speed + increment;
    }

    @Override
    public void Brakes(int decrement) {
        Speed = Speed - decrement;
    }

    @Override
    public void Gear(int NewGear) {
        Gear = NewGear;
    }

    public void printstate() {
        System.out.println("Speed is" + Speed + "Gear is" + Gear);
    }
}

class veh {
    public static void main(String[] args) {
        bike Bike = new bike();
        Bike.SpeedUp(3);
        Bike.Gear(5);
        Bike.Brakes(9);
        Bike.printstate();

        car Car = new car();
        Car.SpeedUp(3);
        Car.Gear(5);
        Car.Brakes(9);
        Car.printstate();

    }
}