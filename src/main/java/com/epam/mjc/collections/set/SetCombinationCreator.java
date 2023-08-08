package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> mergedSet = new HashSet<>(thirdSet);
        mergedSet.removeAll(firstSet);
        mergedSet.removeAll(secondSet);
        firstSet.removeAll(thirdSet);
        secondSet.removeAll(thirdSet);
        firstSet.retainAll(secondSet);
        mergedSet.addAll(firstSet);
        return mergedSet;
    }
}
