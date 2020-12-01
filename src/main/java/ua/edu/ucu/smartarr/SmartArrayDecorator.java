package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray sa;

    public SmartArrayDecorator(SmartArray smartArray) {
        sa = smartArray;
    }
}
