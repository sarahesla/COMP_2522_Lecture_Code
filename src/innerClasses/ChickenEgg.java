package innerClasses;

public class ChickenEgg {
    private int i;
    private Yolk y;

    /**
     * Yolk.
     */
    class Yolk {
        /**
         * @param value
         */
        public void setI(int value) {
            i = value;
        }
    }

    /**
     * Drives the program.
     * @param args
     */
    public static void main(String[] args) {
        ChickenEgg e = new ChickenEgg();
        e.y.setI(5);
        System.out.println("i=" + e.i);
    }
}

