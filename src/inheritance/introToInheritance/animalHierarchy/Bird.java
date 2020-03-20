package inheritance.introToInheritance.animalHierarchy;

/**
 * Bird.
 *
 * @author BCIT
 * @version 2020
 */
public abstract class Bird extends Animal {

    protected String featherColour;

    /**
     * Constructs an object of type Bird.
     *
     * @param age           an int
     * @param featherColour a String
     */
    public Bird(int age, String featherColour) {
        super(age);
        this.featherColour = featherColour;
    }
}
