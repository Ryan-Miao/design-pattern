package com.test.design.cor.hello.impl;

import com.test.design.cor.hello.Approver;
import com.test.design.cor.hello.PurchaseRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 主任类
 * Created by Ryan on 2017/3/31.
 */
public class DirectorApprover extends Approver{

    private Logger LOGGER = LoggerFactory.getLogger(DirectorApprover.class);

    public DirectorApprover() {
        this.name = "主任";
    }

    public DirectorApprover(String name) {
        this.name = "(主任)" + name;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 1000){
            LOGGER.info("{} 审批采购单：{}, 金额：{} 元, 采购目的: {}", this.name,
                    request.getNumber(), request.getAmount(), request.getPurpose() );
        }else {
            this.successor.processRequest(request);//转发
        }
    }
}
