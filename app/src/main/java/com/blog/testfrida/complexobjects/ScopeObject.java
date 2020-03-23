package com.blog.testfrida.complexobjects;

public class ScopeObject {

    private static String privateStaticObject = "private static object";
    protected static String protectedStaticObject = "protected static object";
    public static String publicStaticObject = "public static object";
    static String nonModifiedStaticObject = "static object";

    private static String privateStaticMethod() {
        return "private static method";
    }
    protected static String protectedStaticMethod() {
        return "protected static method";
    }
    public static String publicStaticMethod() {
        return "public static method";
    }
    static String nonModifiedStaticMethod() {
        return "static method";
    }

    private String privateObject = "private object";
    protected String protectedObject = "protected object";
    public String publicObject = "public object";
    public String nonModifiedObject = "object";

    private String privateMethod() {
        return "private method";
    }
    protected String protectedMethod() {
        return "protected method";
    }

    public String publicMethod() {
        return "public method";
    }

    public String nonModifiedMethod() {
        return "method";
    }

    public static int testThisStaticParameter() {
        return 1;
    }

    public int testThisParameter() {
        return 1;
    }
}
