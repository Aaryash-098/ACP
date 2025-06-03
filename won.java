import java.util.jar.Attributes.Name;

class wonders {
    void name() {
        System.out.println("Name : ");
    }

    void location() {
        System.out.println("Location :");
    }
}


class taj extends wonders {
    void name() {
        System.out.println("Name : Taj Mahal");
    }

    void location() {
        System.out.println("Location : India");
    }
}

class gize extends wonders {
    void name() {
        System.out.println("Name : The pyramids of Giza");
    }

    void location() {
        System.out.println("Location : Eygypt");
    }
}

class won {
    public static void main(String[] args) {
        wonders t = new taj();
        wonders g = new gize();

        t.name();
        t.location();

        g.name();
        g.location();
    }
}