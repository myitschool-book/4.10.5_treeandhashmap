package ru.samsung.itschool.mdev;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeAndHashMap {

    private static void testMap(Map<String, String> map) {
        System.out.println(map.getClass());

        // Adding elements to an associative array
        map.put("Russia", "Moscow");
        map.put("USA", "Washington");
        map.put("France", "Paris");

        // Pass through all elements of the array
        System.out.println("All elements:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
        // Quick search for an element by the key
        System.out.println("Russia:");
        System.out.println("Russia -> " + map.get("Russia"));

        // Removing an element by the key
        map.remove("Russia");

        // A nonexistent element is denoted as null
        System.out.println("Russia after remove:");
        System.out.println("Russia -> " + map.get("Russia"));
        System.out.println();

        System.out.println("New map:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        // Return Russia in its place.
        map.put("Russia", "Moscow");
    }

    public static void main(String[] args) {
        testMap(new HashMap<>());
        TreeMap<String, String> treeMap = new TreeMap<>();
        testMap(treeMap);

        // You can take a subset with TreeMap similar to with treeSet
        SortedMap<String, String> submap = treeMap.tailMap("Germany");
        System.out.println("Submap:");
        for (Map.Entry<String, String> entry : submap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}