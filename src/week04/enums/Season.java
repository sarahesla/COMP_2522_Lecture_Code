package ca.bcit.comp2522.code.enums;

/**
 * Enumerates the values for Season.  Check this out.
 *
 * We can put a constructor in an enumeration.
 *
 * The constructor can accept parameters and assign them to
 * instance variables.  Each member of the enum can "construct"
 * itself.  We just need to put the appropriate arguments in
 * a set of parentheses after the constants.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2019
 */
public enum Season {

    /**
     * First season, winter.
     */
    winter("December through February"),

    /**
     * Second season, spring.
     */
    spring("March through May"),

    /**
     * Third season, summer.
     */
    summer("June through August"),

    /**
     * Fourth season, fall (not autumn).
     */
    fall("September through November");

    /**
     * Holds string to describe months of season.
     */
    private String span;

    /**
     * Constructor associates each value with a String.
     *
     * @param months the span of the Season.
     */
    Season(String months) {
        span = months;
    }

    /**
     * Returns the span for the value.
     *
     * @return span as a String
     */
    public String getSpan() {
        return span;
    }
}

