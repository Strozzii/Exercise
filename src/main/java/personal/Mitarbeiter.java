package personal;

public class Mitarbeiter {

    /**
     * Variablen:
     *  -   Statischer Integer Allgemeines Limit für alle Instanzen dieser Klasse und Subklasse (20 als Anfangswert)
     *  -   Vorgesetzter - Variable um einer Instanz einen Vorgesetzten zuzuordnen
     *  -   String um einen Mitarbeiter anhand seines Namens zu identifizieren
     */

    protected static int allgemeines_limit = 20;
    protected Vorgesetzter chef;
    private String name;

    /**
     * Konstruktor:
     *  -   Ordnet der gebildeten Instanz einen Namen zu
     *
     * @param name
     */

    public Mitarbeiter(String name){
        this.name = name;
    }

    /**
     * Statische Methode:
     *  -   Setzt das allgemeine Limit auf einen bestimmten Wert
     * @param all_limit
     */

    protected static void setzeAllgemeinesLimit(int all_limit){
        allgemeines_limit = all_limit;
    }

    /**
     * Void Methode:
     *  -   Setzt den aktuellen Vorgesetzten der Instanz auf einen anderen Wert vom Typ Vorgesetzter
     * @param chef
     */

    protected void setzeVorgesetzten(Vorgesetzter chef){
        this.chef = chef;
    }

    /**
     * Boolsche Methode:
     *  -   True: Wenn der Parameter kleinergleich das allgemeine Limit ist
     *  -   False: Wenn nicht
     * @param wert
     * @return
     */

    protected boolean darfBestellen(int wert){
        return wert <= allgemeines_limit;
    }

    /**
     * String Methode:
     *  -   Zeichenkette für die Ausgabe aller Eigenschaften
     * @return
     */

    protected final String gibInfo(){
        return "Ich bin " + this.gibRang() + ", Name " + this.gibName() +
                "." + this.gibVorgesetzter() + " Mein Bestelllimit ist " +
                this.gibLimit() + " EUR.";
    }

    /**
     *
     * @return
     */

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
