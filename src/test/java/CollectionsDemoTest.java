import org.junit.Test;
import ro.omsu.imit.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CollectionsDemoTest {

    @Test
    public void testNumLines() {
        ArrayList<String> list = new ArrayList<>();
        /*list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("abc");*/
        list.addAll(new ArrayList<String>(Arrays.asList("aaa", "bbb", "ccc", "abc", "cab")));
        int res = CollectionsDemo.numLines(list,'a');
        assertEquals(2, res);
    }
}