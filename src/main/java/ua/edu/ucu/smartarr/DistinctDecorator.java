package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.LinkedHashSet;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    LinkedHashSet linkedHashSet;

    public DistinctDecorator(SmartArray sa) {
        super(sa);
        linkedHashSet = new LinkedHashSet<>(Arrays.asList(sa.toArray()));
    }

    @Override
    public Object[] toArray() {
        return linkedHashSet.toArray();
    }

    @Override
    public int size() {
        return linkedHashSet.size();
    }

    @Override
    public String operationDescription() {
        return "Distinct decorator";
    }
}
