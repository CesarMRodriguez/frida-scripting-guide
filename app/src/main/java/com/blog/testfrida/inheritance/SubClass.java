package com.blog.testfrida.inheritance;

public class SubClass extends SuperClass {

    private int subValue = 0;
    private int setValue = 0;

    public int getSubValue() {
        return subValue;
    }

    public int getSetValue() {
        return setValue;
    }

    public SubClass() {
        super();
        subValue = 10;
        setValue = 10;
    }
}
