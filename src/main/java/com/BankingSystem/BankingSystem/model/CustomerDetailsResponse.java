package com.BankingSystem.BankingSystem.model;

import java.util.ArrayList;

public class CustomerDetailsResponse {

    ArrayList<customerTable> customerList;

    public void setCustomerList(ArrayList<customerTable> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<customerTable> getCustomerList() {
        return customerList;
    }
}
