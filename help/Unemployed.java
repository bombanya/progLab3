package please.help;

public class Unemployed extends Shorty implements Painter{

    public Unemployed(String name){
        super(name);
        setProfession("Безработный ");
    }

    @Override
    public Portrait makePortrait(Shorty shorty) {
        System.out.println(this + " рисует " + shorty + ".");
        return new Portrait(this, shorty);
    }
}
