package InterfaceNeed;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("coding in laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Coding in computer");
    }
}

class Developer {
    public void devapp(Computer obj) {
        obj.code();
    }
}

public class InterfaceNeed {
    public static void main(String[] args) {
        Developer D = new Developer();
        Computer L = new Laptop();
        D.devapp(L);
    }
}
