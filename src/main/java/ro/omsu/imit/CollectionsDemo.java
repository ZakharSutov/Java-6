package ro.omsu.imit;

import java.util.ArrayList;

public class CollectionsDemo {
    public static int numLines(ArrayList<String> list, char c) {
        int count = 0;
        for (String elm : list) {
            if (elm.charAt(0) == c) {
                count++;
            }
        }
        return count;
    }
}
