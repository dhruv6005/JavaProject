package com.practice.string;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {

    public static void main(String[] args) {
        String str = "helloeeh";

        char c = firstNonRepeatingChar(str);
        System.out.println("First non repeat character : " + c);
    }

    private static char firstNonRepeatingChar(String str) {
//        Map<Character, Integer> charCount = new HashMap<>();
//
//        for (char c : str.toCharArray()) {
//            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entrySet : charCount.entrySet()) {
//            if (entrySet.getValue() == 1) {
//                return entrySet.getKey();
//            }
//        }

        Character character = str.chars().mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().orElseGet(null);
        if (character != null)
            return character;
        return 0;
    }
}
