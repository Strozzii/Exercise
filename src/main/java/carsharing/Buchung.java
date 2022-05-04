package carsharing;

public class Buchung {

    private String fahrzeugName;
    private String zeitBeginn;
    private String zeitEnde;

    public Buchung(Fahrzeug fahrzeug, String zeitBeginn, String zeitEnde){
        this.fahrzeugName = fahrzeug.getName();
        this.zeitBeginn = zeitBeginn;
        this.zeitEnde = zeitEnde;
    }

}
