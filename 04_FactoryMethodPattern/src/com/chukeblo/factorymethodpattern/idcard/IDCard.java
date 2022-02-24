package com.chukeblo.factorymethodpattern.idcard;

import com.chukeblo.factorymethodpattern.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("create " + owner + "'s card");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("use" + this);
    }

    @Override
    public String toString() {
        return "[IDCard: " + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
