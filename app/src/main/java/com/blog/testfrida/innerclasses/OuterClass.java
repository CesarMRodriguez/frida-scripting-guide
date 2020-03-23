package com.blog.testfrida.innerclasses;

public class OuterClass {

    public int getIdOuterClass() {
        return 1;
    }

    public char callInnerClass() {
        InnerClass innerClass = new InnerClass();
        return innerClass.getInnerChar();
    }

    private int val = 10;

    class InnerClass {

        public char getInnerChar() {
            return 'i';
        }

    }
}
