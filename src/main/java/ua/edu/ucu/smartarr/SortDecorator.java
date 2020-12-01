package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.ArrayList;
import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    ArrayList arrList;
    public SortDecorator (SmartArray sa, MyComparator myComp) {
        super(sa);
        arrList = new ArrayList<>(Arrays.asList(sa.toArray()));
        arrList.sort(myComp);
    }

    @Override
    public Object[] toArray() {
        return arrList.toArray();
    }

    @Override
    public int size() {
        return arrList.size();
    }

    @Override
    public String operationDescription() {
        return "Sort decorator";
    }
}
