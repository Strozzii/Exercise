package carsharing;

import java.util.HashMap;

public class Fahrzeugmanager {

    HashMap<String, Fahrzeug> fahrzeuge = new HashMap<>();

    public void fuegeFahrzeugHinzu(String name, String ort){
        if(!fahrzeuge.containsKey(name)) {
            fahrzeuge.put(name, new Fahrzeug(name, ort));
        }
    }

    public boolean bucheFahrzeug(String fahrzeug, String anfang, String ende){
        Buchung b = new Buchung(anfang, ende);
        fahrzeuge.get(fahrzeug).buche(b);

        return fahrzeuge.get(fahrzeug).pruefeFrei(b);
    }

}
