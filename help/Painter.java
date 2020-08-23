package please.help;

import java.util.ArrayList;

public interface Painter {
     Portrait makePortrait(Shorty shorty);
     default ArrayList<Portrait> makePortraits(Shorty[] listOfShorties){
          ArrayList<Portrait> listOfPortraits = new ArrayList<>();
          listOfPortraits.ensureCapacity(listOfShorties.length);
          for (Shorty s: listOfShorties){
               listOfPortraits.add(makePortrait(s));
          }
          return listOfPortraits;
     }
}
