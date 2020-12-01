package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    ArrayList arrList;
    public MapDecorator (SmartArray sa, MyFunction myFunc) {
        super(sa);
        arrList = new ArrayList<>();
        for (Object object: sa.toArray()) {
            arrList.add(myFunc.apply(object));
            }
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
        return "Map decorator";
    }
}
