package method_chaining_technique;

/**
 *  METHOD CHAINING DEMO
 */

public class TeaMaker {
    private boolean cup;
    private boolean milk;
    private boolean sugar;
    private boolean decoction;
    private boolean stir;
    private boolean serve;

    public TeaMaker(){}

    public TeaMaker(boolean cup, boolean milk, boolean sugar, boolean decoction, boolean stir, boolean serve) {
        this.cup = cup;
        this.milk = milk;
        this.sugar = sugar;
        this.decoction = decoction;
        this.stir = stir;
        this.serve = serve;
    }

    /**
     * Method Chaining: Ensure that each method in the builder returns the builder itself (this).
     * This allows for fluent method chaining.
     *
     */

    public TeaMaker setCup() {
        this.cup= true;
        System.out.println("Cup Arranged");;
        return this;
    }

    public TeaMaker addMilk() {
        this.milk= true;
        System.out.println("Milk Added");;
        return this;
    }

    public TeaMaker addSugar() {
        this.sugar= true;
        System.out.println("Sugar Added");;
        return this;
    }

    public TeaMaker addDecoction() {
        this.decoction= true;
        System.out.println("Decoction Added");;
        return this;
    }

    public TeaMaker makeStir() {
        this.stir= true;
        System.out.println("Tea Stirred");;
        return this;
    }

    public void setServe() {
        this.serve= true;
        System.out.println("Serverd with Smile :)");;

    }
}
