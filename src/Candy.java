public class Candy {
    private final String flavor;
    public Candy(String flavor){
        this.flavor = flavor;
    }
    /** Returns a String representing the flavor of this piece of candy */
    public String getFlavor() {
        /* implementation not shown */
        return flavor;
    }

    @Override
    public String toString() {
        return flavor;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}