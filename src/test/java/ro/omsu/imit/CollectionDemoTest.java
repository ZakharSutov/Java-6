package ro.omsu.imit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CollectionDemoTest {
    @Test
    public void testNumLines() {
        List<String> list = new ArrayList<>();
        list.addAll(new ArrayList<String>(Arrays.asList("aaa", "bbb", "ccc", "abc", "cab")));
        int res = CollectionDemo.numLines(list, 'a');
        assertEquals(2, res);
    }
}