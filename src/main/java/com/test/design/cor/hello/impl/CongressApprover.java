package com.test.design.cor.hello.impl;

import com.test.design.cor.hello.Approver;
import com.test.design.cor.hello.PurchaseRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 董事会类
 * Created by Ryan on 2017/3/31.
 */
public class CongressApprover extends Approver{

    private Logger LOGGER = LoggerFactory.getLogger(CongressApprover.class);

    public CongressApprover() {
        this.name = "召开董事会";
    }

    public CongressApprover(String name) {
        this.name = name;
    }

    public void processRequest(PurchaseRequest request) {
        LOGGER.info("{} 审批采购单：{}, 金额：{} 元, 采购目的: {}", this.name,
                request.getNumber(), request.getAmount(), request.getPurpose() );
    }
}
