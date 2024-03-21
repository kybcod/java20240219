package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutalbeList1 = List.of("A", "B", "C");
        Set<String> immutableSet1 = Set.of("A", "B", "C");
        Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);
        System.out.println(list);
        System.out.println(immutableList2);

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);
        System.out.println(set);
        System.out.println(immutableSet2);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);
        System.out.println(map);
        System.out.println(immutableMap2);

        String[] arr = {"A", "B", "C"};
        List<String> immutableList3 = Arrays.asList(arr);
//        immutableList3.add("d"); //사이즈 변경만 하는 메소드만 오류
        immutableList3.set(0, "d"); //값변경은 ok


    }
}
