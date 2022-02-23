package com.chukeblo.iteratorpattern;

import com.chukeblo.iteratorpattern.delegation.AbstractPrint;
import com.chukeblo.iteratorpattern.delegation.PrintBannerByDelegation;
import com.chukeblo.iteratorpattern.inheritance.IPrint;
import com.chukeblo.iteratorpattern.inheritance.PrintBannerByInheritance;

public class Main {

    public static void main(String[] args) {
	    IPrint ip = new PrintBannerByInheritance("Hello world!");
        ip.printWeak();
        ip.printStrong();

        System.out.println();

        AbstractPrint ap = new PrintBannerByDelegation(new Banner("Hello world!"));
        ap.printWeak();
        ap.printStrong();
    }
}
