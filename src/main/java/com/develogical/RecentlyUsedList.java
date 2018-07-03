package com.develogical;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {

    List<String> list = new ArrayList<>();

    public boolean isEmpty() {

        return list.isEmpty();

    }

    public void add(String item) {
        list.toString();
        for (String element : list) {
            if(element == item) {
                list.remove(item);
            }
        }


        list.add(0, item);
    }

    public boolean contains(String item) {
        for (String element : list) {
            if(element == item) {
                return true;
            }
        }
        return false;
    }

    public String get(int i) {
        return list.get(i);
    }


    public int size() {
        return list.size();
    }
}
