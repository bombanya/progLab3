package please.help;

public class Doctor extends Shorty implements ExhibitionVisitor{

    public Doctor(String name){
        super(name);
        setProfession("Доктор ");
    }

    @Override
    public void lookAtThePortrait(Portrait portrait) {
        System.out.print(this + " смотрит на " + portrait + ": ");
        if (this.equals(portrait.getPortrayed())){
            System.out.println(Phrases.TAKEOFFENCE.getPhrase());
        }
        else{
            int phraseId = (int)(Math.random() * 10 % Phrases.values().length);
            System.out.println(Phrases.values()[phraseId].getPhrase());
        }
    }
}
