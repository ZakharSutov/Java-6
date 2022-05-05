import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ListDemoTest {

    ArrayList<Human> arrayList = new ArrayList<>();
    Student human1 = new Student("Сивов", "Алексей", "Дмитриевич", 19, "ИМИМ");
    Student human2 = new Student("Мезенцев", "Антон", "Сергеевич", 21, "UwU");
    Human human3 = new Human("Шутов", "Захар", "Андреевич", 19);
    Human human4 = new Human("Сивов", "Алексей", "Дмитриевич", 19);
    Human human5 = new Human("Сивов", "Мурат", "Муратович", 5);
    Human human6 = new Human("Ощепков", "Егор", "Сергеевич", 19);

    @Test
    public void listNamesake() {
        arrayList.addAll(new ArrayList<Human>(Arrays.asList(human1, human2, human3, human5)));
        ArrayList<Human> listAns = new ArrayList<>();
        listAns.add(new Human("Сивов", "Алексей", "Дмитриевич", 19));
        listAns.add(new Human("Сивов", "Мурат", "Муратович", 5));
        assertEquals(listAns, ListDemo.listNamesake(arrayList, human4));
    }

    @Test
    public void listWithoutHuman() {
        arrayList.addAll(new ArrayList<Human>(Arrays.asList(human1, human2, human3, human5)));
        ArrayList<Human> listAns = new ArrayList<>();
        listAns.addAll(new ArrayList<Human>(Arrays.asList(human2, human3, human5)));
        assertEquals(listAns, ListDemo.listWithoutHuman(arrayList, human1));
    }

    @Test
    public void listWithoutHuman1() {
        arrayList.addAll(new ArrayList<Human>(Arrays.asList(human1, human2, human3, human5)));
        ArrayList<Human> listAns = new ArrayList<>();
        listAns.addAll(new ArrayList<Human>(Arrays.asList(human2, human3, human5)));
        arrayList.set(1, human5);
        assertNotEquals(arrayList, ListDemo.listWithoutHuman(arrayList, human1));
    }

    @Test
    public void listSetWithoutSet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(7, 8, 9));
        ArrayList<Set<Integer>> listSet = new ArrayList<>(Arrays.asList(set1, set2, set3));

        ArrayList<Set<Integer>> setAns = new ArrayList<>(Arrays.asList(set1, set2));
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 8, 90));
        assertEquals(setAns, ListDemo.listSetWithoutSet(listSet, set));
    }

    @Test
    public void maxAge() {
        ArrayList<Human> listHuman = new ArrayList<>(Arrays.asList(human1, human2, human3, human5, human6));
        Set<Human> setRes = new HashSet<Human>(Arrays.asList(human2));
        assertEquals(setRes, ListDemo.maxAge(listHuman));
    }

    @Test
    public void setHumanContained() {
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, human1);
        map.put(2, human2);
        map.put(3, human3);
        map.put(4, human4);
        map.put(5, human5);
        map.put(6, human6);
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 6));
        Set<Human> humanSet = new HashSet<>(Arrays.asList(human1, human6));
        assertEquals(humanSet, ListDemo.setHumanContained(map, set));
    }

    @Test
    public void adultList() {
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, human1);
        map.put(2, human2);
        map.put(3, human3);
        map.put(4, human4);
        map.put(5, human5);
        map.put(6, human6);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
        assertEquals(list, ListDemo.adultList(map));
    }

    @Test
    public void ageMap() {
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, human1);
        map.put(2, human2);
        map.put(3, human3);
        map.put(4, human4);
        map.put(5, human5);
        map.put(6, human6);
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 19);
        map1.put(2, 21);
        map1.put(3, 19);
        map1.put(4, 19);
        map1.put(5, 5);
        map1.put(6, 19);
        assertEquals(map1, ListDemo.ageMap(map));
    }

    @Test
    public void mapListHuman() {
        Set<Human> set = new HashSet<>(Arrays.asList(human1, human2, human3, human4, human5, human6));
        ArrayList<Human> list1 = new ArrayList<>(Arrays.asList(human6, human3, human1, human4));
        ArrayList<Human> list2 = new ArrayList<>();
        list2.add(human2);
        ArrayList<Human> list3 = new ArrayList<>(Arrays.asList(human5));
        Map<Integer, ArrayList<Human>> map = new HashMap<>();
        map.put(19, list1);
        map.put(21, list2);
        map.put(5, list3);
        assertEquals(map, ListDemo.mapListHuman(set));
    }
}