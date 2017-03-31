package com.test.design.cor.hello.impl;

import com.test.design.cor.hello.Approver;
import com.test.design.cor.hello.PurchaseRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 董事长类
 * Created by Ryan on 2017/3/31.
 */
public class PresidentApprover extends Approver{

    private Logger LOGGER = LoggerFactory.getLogger(PresidentApprover.class);

    public PresidentApprover() {
        this.name = "董事长";
    }

    public PresidentApprover(String name) {
        this.name = name;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000){
            LOGGER.info("{} 审批采购单：{}, 金额：{} 元, 采购目的: {}", this.name,
                    request.getNumber(), request.getAmount(), request.getPurpose() );
        }else {
            this.successor.processRequest(request);//转发
        }
    }
}
