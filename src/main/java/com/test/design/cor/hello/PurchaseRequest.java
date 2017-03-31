package com.test.design.cor.hello;

/**
 * 请求消息类
 * Created by Ryan on 2017/3/31.
 */
public class PurchaseRequest {
    private Double amount;
    private Integer number;
    private String purpose;

    public PurchaseRequest() {
    }

    public PurchaseRequest(Double amount, Integer number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "PurchaseRequest{" +
                "amount=" + amount +
                ", number=" + number +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
