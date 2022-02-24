package com.chukeblo.iteratorpattern;

public class Main {

    public static void main(String[] args) {
	    AbstractDisplay cd = new CharDisplay('H');
        AbstractDisplay sd = new StringDisplay("Hello, world.");

        cd.display();
        sd.display();
    }
}
