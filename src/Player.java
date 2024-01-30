public class Player {
    int seed;
    String fullName;
    String country;
    public Player(int inSeed, String inFullName, String inCountry){

        this.seed = inSeed;
        this.fullName = inFullName;
        this.country = inCountry;

    }

    public String getCountryCode(){

        return country;
    }

    public String toString(){

        return (fullName + " (" + country + ") ");
    }

}
