package please.help;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Exhibition hermitage = new Exhibition();
        Doctor pillman = new Doctor("Пилюлькин");
        Unemployed neznaika = new Unemployed("Незнайка");
        Unemployed donut = new Unemployed("Пончик");
        Unemployed pellet = new Unemployed("Пулька");

        ArrayList<Portrait> portraits = neznaika.makePortraits(new Shorty[]{pillman, donut, pellet});
        hermitage.addPortraits(portraits);
        hermitage.addVisitor(pillman);
        hermitage.start();
    }
}
