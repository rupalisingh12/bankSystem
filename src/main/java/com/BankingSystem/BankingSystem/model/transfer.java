package com.BankingSystem.BankingSystem.model;

import java.util.ArrayList;

public class transfer {
    customerTable sender;
    customerTable reciever;

    public customerTable getSender() {
        return sender;
    }

    public customerTable getReciever() {
        return reciever;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    int transferAmount;
    public transfer(customerTable sender, customerTable reciever, int transferAmount) {
        this.sender = sender;
        this.reciever = reciever;
        this.transferAmount = transferAmount;
    }
    public transfer() {
    }













}
