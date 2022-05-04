package string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TokensTest {

    String s = "abc-def+ghi";
    String t = "+-";

    @Test
    @DisplayName("Tokens Test")
    void tokensTest(){
        assertEquals("def", Tokens.tokens(s,t)[1], "Funzt net!");
    }


}
