package carsharing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class FahrzeugmanagerTest {

    Fahrzeugmanager test = new Fahrzeugmanager();

    @BeforeEach
    void setUp(){
        test.fuegeFahrzeugHinzu("Rathaus1", "Rathaus");
        test.fuegeFahrzeugHinzu("Bahnhof1", "Bahnhof");
        test.fuegeFahrzeugHinzu("Bahnhof2", "Bahnhof");
        test.fuegeFahrzeugHinzu("Bahnhof3", "Bahnhof");

        test.bucheFahrzeug("Bahnhof1", "2005/04/14 20:00", "2005/04/15 08:00");
        test.bucheFahrzeug("Bahnhof1", "2005/04/15 18:00", "2005/04/16 00:00");
        test.bucheFahrzeug("Bahnhof2", "2005/04/14 11:00", "2005/04/15 12:00");
        test.bucheFahrzeug("Bahnhof3", "2005/04/15 10:00", "2005/04/15 19:00");
    }

    @Test
    void testGibFahrzeugnamen1(){
        ArrayList<String> soll = new ArrayList<>();

        soll.add("Bahnhof1");
        soll.add("Bahnhof2");
        soll.add("Bahnhof3");
        soll.add("Rathaus1");

        assertEquals(soll, test.gibFahrzeugnamen());
    }

    @Test
    void testGibFahrzeugnamen2(){
        ArrayList<String> soll = new ArrayList<>();

        soll.add("Bahnhof1");
        soll.add("Bahnhof2");
        soll.add("Bahnhof3");

        assertEquals(soll, test.gibFahrzeugnamen("Bahnhof"));
    }

    @Test
    void testGibVerfuegbareFahrzeuge1() {
        ArrayList<String> soll = new ArrayList<>();

        assertEquals(soll, test.gibVerfuegbareFahrzeuge("Bahnhof", "2005/04/15 11:30", "2005/04/15 19:00"));
    }

    @Test
    void testGibVerfuegbareFahrzeuge2() {
        ArrayList<String> soll = new ArrayList<>();
        soll.add("Bahnhof1");
        soll.add("Bahnhof2");

        assertEquals(soll, test.gibVerfuegbareFahrzeuge("Bahnhof", "2005/04/15 12:00", "2005/04/15 18:00"));
    }

    @Test
    void testGibVerfuegbareFahrzeuge3() {
        ArrayList<String> soll = new ArrayList<>();
        soll.add("Bahnhof2");
        soll.add("Bahnhof3");

        assertEquals(soll, test.gibVerfuegbareFahrzeuge("Bahnhof", "2005/04/15 19:15", "2005/04/15 23:00"));
    }

    @Test
    void testBucheFahrzeug1() {

        assertTrue(test.bucheFahrzeug("Bahnhof 3", "2005/04/15 09:00", "2005/04/15 10:00"));
    }

    @Test
    void testBucheFahrzeug2() {

        test.bucheFahrzeug("Bahnhof 3", "2005/04/15 09:00", "2005/04/15 10:00");
        assertFalse(test.bucheFahrzeug("Bahnhof 3", "2005/04/15 09:00", "2005/04/15 11:00"));
    }

    @Test
    void testBucheFahrzeug3() {

        assertFalse(test.bucheFahrzeug("Bahnhof 3", "2005/04/15 11:00", "2005/04/15 18:00"));
    }

    @Test
    void testBucheFahrzeug4() {

        assertFalse(test.bucheFahrzeug("Bahnhof 3", "2005/04/15 18:00", "2005/04/15 20:00"));
    }

    @Test
    void testBucheFahrzeug5() {

        assertTrue(test.bucheFahrzeug("Bahnhof 3", "2005/04/15 19:00", "2005/04/15 20:00"));
    }

    @Test
    void testBucheFahrzeug6() {

        test.bucheFahrzeug("Bahnhof 3", "2005/04/15 19:00", "2005/04/15 20:00");
        assertFalse(test.bucheFahrzeug("Bahnhof 3", "2005/04/15 09:00", "2005/04/15 20:00"));
    }





}
