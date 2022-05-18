package zahlenfolge;

import org.junit.jupiter.api.Test;

public class EndlicheFolgeTest {

    @Test
    void testZugriffAufFolge1() {
        ZahlenfolgeTestUtil.testZugriffAufFolge(
                new EndlicheFolge(new int[0]), new Integer[0], false);

    }


}
