package carsharing;

public class Buchung {

    private String start;
    private String ende;

    public Buchung(String s, String e){
        this.start = s;
        this.ende = e;
    }

    public boolean pruefeBuchung(Buchung b){
        return this.start.compareTo(b.ende) >= 0
                || this.ende.compareTo(b.start) <= 0;
    }


}
