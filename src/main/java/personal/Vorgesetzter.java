package personal;

public class Vorgesetzter extends Mitarbeiter{

    private int limit;

    public Vorgesetzter(String name){
        super(name);
        this.limit = -1;

    }

    public void setzeBestelllimit(int limit){
        this.limit = limit;
    }

    @Override
    public boolean darfBestellen(int wert){
        return this.limit < 0
                ? wert <= allgemeines_limit
                : wert <= this.limit;
    }

    @Override
    protected String gibRang() {
        return "Vorgesetzter";
    }


    protected int gibLimit() {
        return this.limit < 0
                ? allgemeines_limit
                : this.limit;
    }
}
