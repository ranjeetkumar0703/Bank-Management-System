package com.blog.util_Dec_1st;

import java.util.function.Consumer;

public class MainUtil16_Consumer {
    public static void main(String[] args) {
        Consumer<String>myConsumer=S->System.out.println("Consumed :"+S);
        myConsumer.accept("Hello bro ");

    }
}
