package unit1Package;

public class locationStuff {

    public int cities;
    public int stuff;

    public locationStuff(int city) {
        this.cities = city;
    }

    public int getCity() {
        return cities;
    }

    public void incrementCity() {
        cities++;
    }

    public int getStuff() {
        return stuff;
    }

    public void incrementStuff() {
        stuff++;
    }

    @Override

    public String toString(){
        return String.valueOf("         " + getCity() + "                 " + getStuff());
    }
}
