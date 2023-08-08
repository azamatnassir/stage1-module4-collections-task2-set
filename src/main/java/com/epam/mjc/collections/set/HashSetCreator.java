package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                int x = num;
                hashSet.add(num);
                while (x % 2 == 0) {
                    x /= 2;
                    hashSet.add(x);
                }
            } else {
                int x = num * 2;
                hashSet.add(num);
                hashSet.add(x);
            }
        }
        return hashSet;
    }
}
