package carsharing;

public class Fahrzeug {

    private String name;
    private String standort;

    public Fahrzeug(String name, String standort){
        this.name = name;
        this.standort = standort;
    }

    public String getName(){
        return this.name;
    }

}
