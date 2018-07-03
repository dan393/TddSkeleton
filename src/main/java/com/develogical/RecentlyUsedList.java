package com.develogical;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {

    private final List<String> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();

    }

    public void add(String item) {
        if(item == null) {
            throw new IllegalArgumentException("Null values are not allowed!");
        }

        if (list.contains(item)) {
            list.remove(item);
        }

        list.add(0, item);
    }

    public boolean contains (String item) {
        return list.contains(item);
    }

    public String get(int i) {
        return list.get(i);
    }


    public int size() {
        return list.size();
    }
}
