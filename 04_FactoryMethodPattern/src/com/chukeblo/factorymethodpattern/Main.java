package com.chukeblo.factorymethodpattern;

import com.chukeblo.factorymethodpattern.framework.Factory;
import com.chukeblo.factorymethodpattern.framework.Product;
import com.chukeblo.factorymethodpattern.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
	    Factory factory = new IDCardFactory();

        Product card1 = factory.create("Takeru Sato");
        Product card2 = factory.create("Hinako Takahashi");
        Product card3 = factory.create("Kenji Yamamoto");

        card1.use();
        card2.use();
        card3.use();
    }
}
