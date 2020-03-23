package com.blog.testfrida.exceptions;

public class ThrowingExceptionClass {

    public static void callException() throws CustomException {
        throw new CustomException();
    }
}
