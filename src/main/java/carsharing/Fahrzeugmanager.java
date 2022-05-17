package carsharing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Fahrzeugmanager {

    HashMap<String, Fahrzeug> fahrzeuge = new HashMap<>();

    public void fuegeFahrzeugHinzu(String name, String ort){
        if(!fahrzeuge.containsKey(name)) {
            fahrzeuge.put(name, new Fahrzeug(name, ort));
        }
    }

    public ArrayList<String> gibFahrzeugnamen(){
        ArrayList<String> output = new ArrayList<>(fahrzeuge.keySet());
        Collections.sort(output);
        return output;
    }

    public ArrayList<String> gibFahrzeugnamen(String ort){
        ArrayList<String> output = new ArrayList<>();
        Iterator<Fahrzeug> iter = fahrzeuge.values().iterator();

        while(iter.hasNext()){
            Fahrzeug tmp = iter.next();
            if(tmp.gibStandort().equals(ort)){
                output.add(tmp.gibName());
            }

        }
        Collections.sort(output);
        return output;

    }

    public boolean bucheFahrzeug(String fahrzeug, String anfang, String ende){
        Buchung b = new Buchung(anfang, ende);
        fahrzeuge.get(fahrzeug).buche(b);

        return fahrzeuge.get(fahrzeug).pruefeFrei(b);
    }

    public ArrayList<String> gibVerfuegbareFahrzeuge(String ort, String start, String ende){
        ArrayList<String> output = new ArrayList<>();
        Iterator<Fahrzeug> iterValues = fahrzeuge.values().iterator();

        Buchung b = new Buchung (start, ende);
        while(iterValues.hasNext()){
            Fahrzeug tmp = iterValues.next();
            if(tmp.gibStandort() == ort && tmp.pruefeFrei(b)){
                output.add(tmp.gibName());
            }
        }
        Collections.sort(output);
        return output;
    }

}
