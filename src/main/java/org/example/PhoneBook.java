package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, HashSet<String>> map;

    PhoneBook() {
        this.map = new HashMap<>();
    }

    void add(String family, String phoneNum) {
        HashSet<String> numbers;

        if (map.containsKey(family)) {
            numbers = map.get(family);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneNum);
        map.put(family, numbers);
    }

    Set<String> get(String family) {
        return map.get(family);
    }

}
