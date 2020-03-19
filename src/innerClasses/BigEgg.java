package innerClasses;

public class BigEgg {

    public static void main(String[] args) {
        new Egg();
    }
}

class Egg {
    private Yolk y;

    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }
}

