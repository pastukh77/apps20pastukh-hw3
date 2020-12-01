package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    Object[] contents;
    int size;
    public BaseArray(Object[] items) {
        contents = items;
        size = items.length;
    }


    @Override
    public Object[] toArray() {
        return contents;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String operationDescription() {
        return "There are no decorators here.";
    }
}
