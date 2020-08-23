package please.help;

import java.util.Objects;

public class Portrait{

    private final Shorty author, portrayed;
    private final int portraitId;
    private static int nextPortraitId = 0;

    {
        portraitId = nextPortraitId;
        nextPortraitId++;
    }

    public Portrait(Shorty author, Shorty portrayed){
        this.author = author;
        this.portrayed = portrayed;
    }

    public Shorty getAuthor(){
        return author;
    }

    public Shorty getPortrayed(){
        return portrayed;
    }

    public int getPortraitId(){
        return portraitId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        return ((Portrait) other).getPortraitId() == this.portraitId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(portraitId, author, portrayed);
    }

    @Override
    public String toString() {
        return "Портрет " + portrayed + ", написанный " + author;
    }
}
