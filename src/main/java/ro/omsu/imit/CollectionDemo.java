package ro.omsu.imit;

import java.util.List;

public class CollectionDemo {
    public static int numLines(List<String> list, char c) {
        int count = 0;
        for (String elm : list) {
            if (elm.charAt(0) == c) {
                count++;
            }
        }
        return count;
    }

}
