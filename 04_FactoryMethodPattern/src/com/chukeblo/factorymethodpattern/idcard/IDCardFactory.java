package com.chukeblo.factorymethodpattern.idcard;

import com.chukeblo.factorymethodpattern.framework.Factory;
import com.chukeblo.factorymethodpattern.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("registered " + product);
    }
}
