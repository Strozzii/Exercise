package carsharing;

import org.junit.jupiter.api.BeforeEach;

public class FahrzeugmanagerTest {

    Fahrzeugmanager test = new Fahrzeugmanager();

    @BeforeEach
    void setUp(){
        test.fuegeFahrzeugHinzu("Rathaus1", "Rathaus");
        test.fuegeFahrzeugHinzu("Bahnhof1", "Bahnhof");
        test.fuegeFahrzeugHinzu("Bahnhof2", "Bahnhof");
        test.fuegeFahrzeugHinzu("Bahnhof3", "Bahnhof");

        test.bucheFahrzeug("Bahnhof1", "14.April 2005, 20:00 Uhr", "15.April 2005, 08:00 Uhr");
        test.bucheFahrzeug("Bahnhof1", "15.April 2005, 18:00 Uhr", "16.April 2005, 00:00 Uhr");
        test.bucheFahrzeug("Bahnhof2", "14.April 2005, 11:00 Uhr", "15.April 2005, 12:00 Uhr");
        test.bucheFahrzeug("Bahnhof3", "15.April 2005, 10:00 Uhr", "15.April 2005, 19:00 Uhr");
    }





}
