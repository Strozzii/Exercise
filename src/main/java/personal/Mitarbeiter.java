package personal;

public class Mitarbeiter {

    protected static int allgemeines_limit = 20;
    protected Vorgesetzter chef;
    private String name;

    public Mitarbeiter(String name){
        this.name = name;
    }

    protected static void setzeAllgemeinesLimit(int all_limit){
        allgemeines_limit = all_limit;
    }

    protected void setzeVorgesetzten(Vorgesetzter chef){
        this.chef = chef;
    }

    protected boolean darfBestellen(int wert){
        return wert <= allgemeines_limit;
    }

    protected final String gibInfo(){
        return "Ich bin " + this.gibRang() + ", Name " + this.gibName() +
                "." + this.gibVorgesetzter() + " Mein Bestelllimit ist " +
                this.gibLimit() + " EUR.";
    }

    protected int gibLimit() {
        return allgemeines_limit;
    }

    protected String gibVorgesetzter() {
        return this.chef == null
                ? ""
                : " Mein Vorgesetzter ist " + chef.gibName() + ".";
    }

    protected String gibName() {
        return name;
    }

    protected String gibRang() {
        return this.chef == null
                ? "freier Mitarbeiter"
                : "Mitarbeiter";
    }

    protected final String gibHierarchie(){
        String hierarchie = this.gibRang() + " " + this.gibName();
        Vorgesetzter k = this.chef;

        while(k != null){
            hierarchie = k.gibRang() + " " + k.gibName() + "\n" + hierarchie;
            k = k.chef;
        }

        return hierarchie;
    }


}
