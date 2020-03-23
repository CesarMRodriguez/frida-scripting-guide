package com.blog.testfrida.complexobjects;

public class DateAbstraction {
    enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

    public static String getMonthName(Month month) {
        Month month2 = Month.APR;

        switch (month) {
            case JAN: return "January";
            case FEB: return "February";
            case MAR: return "March";
            case APR: return "April";
            case JUN: return "June";
            case JUL: return "Jule";
            case AUG: return "August";
            case MAY: return "May";
            case SEP: return "September";
            case OCT: return "October";
            case NOV: return "November";
            case DEC: return "December";
            default: return null;
        }
    }

    public static Month getMay() {
        return Month.MAY;
    }
}
