package com.test.design.cor.hello;

import com.test.design.cor.hello.impl.CongressApprover;
import com.test.design.cor.hello.impl.DirectorApprover;
import com.test.design.cor.hello.impl.PresidentApprover;
import com.test.design.cor.hello.impl.VicePresidentApprover;

/**
 * Created by Ryan on 2017/3/31.
 */
public class Client {

    public static void main(String[] args) {
        Approver director = new DirectorApprover();
        Approver vicePresident = new VicePresidentApprover();
        Approver president = new PresidentApprover();
        Approver congress = new CongressApprover();

        //创建责任链
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(100.0,10001,"购买倚天剑");
        director.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(6000.0,10002,"购买《金刚经》");
        director.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(10000.0,10003,"购买《葵花宝典》");
        director.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000.0,10004,"购买桃花岛");
        director.processRequest(pr4);
    }
}
