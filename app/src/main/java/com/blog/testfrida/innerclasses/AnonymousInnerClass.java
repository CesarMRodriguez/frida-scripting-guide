package com.blog.testfrida.innerclasses;

public class AnonymousInnerClass {

    public String getMessageAnonymous() {
        InnerInterface inner = new InnerInterface() {
            @Override
            public String getMessage() {
                return "getMessage";
            }
        };

        return inner.getMessage();
    }
}
