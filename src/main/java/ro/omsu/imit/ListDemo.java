package ro.omsu.imit;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {
    public static ArrayList<Human> listNamesake(ArrayList<Human> arrayList, Human human) {
        ArrayList<Human> listRes = new ArrayList<>();
        for (Human elm : arrayList) {
            if (elm.getLastName().equals(human.getLastName())) {
                listRes.add(elm);
            }
        }
        return listRes;
    }

    public static ArrayList<Human> listWithoutHuman(ArrayList<Human> arrayList, Human human) {
        ArrayList<Human> listRes = new ArrayList<>();
        for (Human elm : arrayList) {
            if (!elm.equals(human)) {
                listRes.add(elm);
            }
        }
        return listRes;
    }

    public static ArrayList<Set<Integer>> listSetWithoutSet(ArrayList<Set<Integer>> arraySet, Set<Integer> set) {
        ArrayList<Set<Integer>> listRes = new ArrayList<>();
        int flug = 0;
        for (Set<Integer> elmList : arraySet) {
            for (int elmSet : set) {
                if (elmList.contains(elmSet)) {
                    flug++;
                }
            }
            if (flug == 0) {
                listRes.add(elmList);
            }
            flug = 0;
        }
        return listRes;
    }

    public static Set<Human> maxAge(ArrayList<Human> list) {
        Set<Human> result = new HashSet<>();
        int max = 0;
        for (Human human : list) {
            if (human.getAge() > max) {
                max = human.getAge();
            }
        }
        for (Human human : list) {
            if (human.getAge() == max) {
                result.add(human);
            }
        }
        return result;
    }

    public static Set<Human> setHumanContained(Map<Integer, Human> humanMap, Set<Integer> integerSet) {
        Set<Human> result = new HashSet<>();
        Human v = null;
        for (int k : integerSet) {
            v = humanMap.get(k);
            if (v != null) {
                result.add(v);
            }
        }
        return result;
    }

    public static ArrayList<Integer> adultList(Map<Integer, Human> humanMap) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Human> map: humanMap.entrySet()) {
            if (map.getValue().getAge() >= 18) {
                result.add(map.getKey());
            }
        }
        return result;
    }

    public static Map<Integer, Integer> ageMap(Map<Integer, Human> humanMap) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, Human> map: humanMap.entrySet()) {
            result.put(map.getKey(), map.getValue().getAge());
        }
        return result;
    }

    public static Map<Integer, ArrayList<Human>> mapListHuman(Set<Human> humanSet) {
        Map<Integer, ArrayList<Human>> result = new HashMap<>();
        Set<Integer> ageSet= new HashSet<>();
        for (Human human: humanSet) {
            ageSet.add(human.getAge());
        }
        for (int age: ageSet) {
            ArrayList<Human> humanArrayList = new ArrayList<>();
            for (Human human: humanSet) {
                if (human.getAge() == age) {
                    humanArrayList.add(human);
                }
            }
            result.put(age, humanArrayList);
        }
        return result;
    }
}
