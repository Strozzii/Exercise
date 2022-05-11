package carsharing;

import java.util.ArrayList;
import java.util.Iterator;

public class Fahrzeug {
    private String name;
    private String ort;
    private ArrayList<Buchung> termine = new ArrayList<>();

    public Fahrzeug(String name, String ort){
        this.name = name;
        this.ort = ort;
    }

    public String gibName(){
        return this.name;
    }

    public String gibStandort(){
        return this.ort;
    }

    public boolean pruefeFrei(Buchung b){
        boolean istFrei = true;

        if(!termine.isEmpty()){
            Iterator<Buchung> i = termine.iterator();

            while(i.hasNext() && istFrei){
                istFrei = i.next().pruefeBuchung(b);
            }

        }
        return istFrei;
    }

    public void buche(Buchung b){
        if(this.pruefeFrei(b)) {
            termine.add(b);
        }
    }




}
