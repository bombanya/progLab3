package please.help;

import java.util.Objects;

public abstract class Shorty {

    private final String name;
    protected String profession;

    public Shorty(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    protected void setProfession(String profession){
        this.profession = profession;
    }

    public String getProfession(){
        return profession;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        return (((Shorty) other).getName()).equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return profession + name;
    }
}
