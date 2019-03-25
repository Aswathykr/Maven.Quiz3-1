package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                result.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i))
                        + str.substring(i + 1));
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
