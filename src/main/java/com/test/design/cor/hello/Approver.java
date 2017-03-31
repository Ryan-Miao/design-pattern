package com.test.design.cor.hello;

/**
 * Created by Ryan on 2017/3/31.
 */
public abstract class Approver {

    protected String name = "default";
    protected Approver successor;

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);

}
