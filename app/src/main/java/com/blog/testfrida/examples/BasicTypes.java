package com.blog.testfrida.examples;

import com.blog.testfrida.complexobjects.Person;

import java.util.List;

public class BasicTypes {

    public static int addTwoInts(int val1, int val2) {
        return val1 + val2;
    }

    public static byte addTwoBytes(byte val1, byte val2) {
        return (byte) (val1 + val2);
    }

    public static short addTwoShorts(short val1, short val2) {
        return (short) (val1 + val2);
    }

    public static long addTwoLongs(long val1, long val2) {
        return val1 + val2;
    }

    public static boolean negate(boolean value) {
        return !value;
    }

    public static float divideFloat(float val1, float val2) {
        return val1/val2;
    }

    public static double divideDouble(double val1, double val2) {
        return val1/val2;
    }

    public static char getNextChar(char char1) {
        return (char) (char1 + 1);
    }

    public static boolean isCChar(char char1) {
        return char1 == 'c';
    }

    public static String concatString(String firstString, String secondString) {
        return firstString + secondString;
    }

    public static String concat(String firstString, int value, String secondString) {
        return firstString + value + secondString;
    }

    public static String getString(String toFormat){
        return toFormat.toUpperCase();
    }

    public static boolean compareToString(String hex) {
        return "hex".equals(hex);
    }

    public static int multiply(int val1, int val2) {
        return val1 * val2;
    }

    public static byte multiply(byte val1, byte val2) {
        return (byte) (val1 * val2);
    }

    public static short multiply(short val1, short val2) {
        return (short) (val1 * val2);
    }

    public static long multiply(long val1, long val2) {
        return val1 * val2;
    }

    public static float multiply(float val1, float val2) {
        return val1 * val2;
    }

    public static float multiply(byte[] val1, byte val2) {
        return 12;
    }

    public static float multiply(int[] val1, int val2) {
        return 12;
    }

    public static float multiply(short[] val1, short val2) {
        return 12;
    }

    public static float multiply(long[] val1, long val2) {
        return 12;
    }

    public static float multiply(float[] val1, float val2) {
        return 12;
    }

    public static float multiply(double[] val1, double val2) {
        return 12;
    }

    public static float multiply(Person[] val1, Person val2) {
        return 12;
    }

    public static float multiply(char[] val1, char val2) {
        return 12;
    }

    public static float multiply(int[][] val1, int val2) {
        return 12;
    }

    public static float multiply(Person val1, float val2) {
        return 12;
    }

    public static float multiply(List<String> val1, float val2) {
        return 12;
    }

    public static Boolean getDebug() {
        return new Boolean(true);
    }
}
