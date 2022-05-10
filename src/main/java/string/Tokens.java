package string;

import java.util.StringTokenizer;

public class Tokens {

    public static String[] tokens(String s, String t) {

        String[] tokens = null;

        try {

            if (s == null || t == null) {
                return tokens;
            }

            StringTokenizer st = new StringTokenizer(s, t);

            tokens = new String[st.countTokens()];

            int count = 0;
            while (st.hasMoreTokens()) {
                tokens[count++] = st.nextToken();
            }
        } catch (Exception e) {
            e.printStackTrace();



        }
        return tokens;
    }
}
