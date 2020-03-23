package com.blog.testfrida.interfaces;

public class MyInterfaceClass implements MyInterface {

    @Override
    public String getMessage() {
        return "this works";
    }

    public static MyInterface getNewInstance() {
        return new MyInterfaceClass();
    }

    public int getInt() {
        return 2;
    }
}
