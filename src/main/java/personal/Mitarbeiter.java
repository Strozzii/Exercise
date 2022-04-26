package personal;

public class Mitarbeiter {

    static int allgemeines_limit = 20;
    protected Vorgesetzter chef;
    protected String name;

    public Mitarbeiter(String name){
        this.name = name;
    }

    public static void setzeAllgemeinesLimit(int all_limit){
        allgemeines_limit = all_limit;
    }

    public void setzeVorgesetzten(Vorgesetzter chef){
        this.chef = chef;
    }

    public boolean darfBestellen(int wert){
        return wert <= allgemeines_limit;
    }

    public String gibInfo(){
        return "Ich bin " + this.gibRang() + ", Name " + this.gibName() +
                "." + this.gibVorgesetzter() + " Mein Bestelllimit ist " +
                this.gibLimit() + " EUR.";
    }

    public int gibLimit() {
        return allgemeines_limit;
    }

    public String gibVorgesetzter() {
        return this.chef == null
                ? ""
                : " Mein Vorgesetzter ist " + chef.gibName() + ".";
    }

    public String gibName() {
        return name;
    }

    public String gibRang() {
        return this.chef == null
                ? "freier Mitarbeiter"
                : "Mitarbeiter";
    }

    public String gibHierarchie(){
        String hierarchie = this.gibRang() + " " + this.gibName();
        Vorgesetzter k = this.chef;

        while(k != null){
            hierarchie = k.gibRang() + " " + k.gibName() + "\n" + hierarchie;
            k = k.chef;
        }

        return hierarchie;
    }


}
