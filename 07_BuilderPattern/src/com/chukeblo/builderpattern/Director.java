package com.chukeblo.builderpattern;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("common greeting");
        builder.makeItems(new String[] {
                "How are you?",
                "Hello.",
                "Hi."
        });
        builder.makeString("greetings by time of day");
        builder.makeItems(new String[] {
                "Good morning.",
                "Good afternoon.",
                "Good evening."
        });
        builder.close();
    }
}
