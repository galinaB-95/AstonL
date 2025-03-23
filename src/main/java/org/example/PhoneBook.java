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
        if (map.containsKey(family)) {
           map.get(family).add(phoneNum);
        } else {
            map.put(family, new HashSet<>( Set.of(phoneNum)));
        }
    }

    public Set<String>  get(String family) {
        return map.get(family);
    }

}
