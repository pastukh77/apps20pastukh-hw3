package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    ArrayList arrList;
    public FilterDecorator(SmartArray sa, MyPredicate pred) {
       super(sa);
       arrList = new ArrayList<>();
       for (Object object: sa.toArray()) {
           if (pred.test(object)) {
               arrList.add(object);
           }
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
        return "Filter decorator";
    }
}
