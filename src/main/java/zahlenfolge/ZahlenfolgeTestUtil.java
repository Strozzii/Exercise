package zahlenfolge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ZahlenfolgeTestUtil {
    @Test
    static void testZugriffAufFolge(Zahlenfolge folge, Integer[] sollElemente, boolean sollHatNaechsten) {
        ArrayList<Integer> istElemente = new ArrayList<>();

        for (int i = 0; i < sollElemente.length; i++){
            assertTrue(folge.hatNaechstes());
            assertTrue(folge.hatNaechstes());

            istElemente.add(folge.gibNaechstes());
        }

        assertEquals(Arrays.asList(sollElemente), istElemente);

        assertEquals(sollHatNaechsten, folge.hatNaechstes());
        assertEquals(sollHatNaechsten, folge.hatNaechstes());

        if(sollHatNaechsten) {
            folge.gibNaechstes();
        } else {
            assertThrows(NoSuchElementException.class, () -> folge.gibNaechstes(),
                    "Es hätte eine Exception geworfen werden müssen.");
        }
    }

}
