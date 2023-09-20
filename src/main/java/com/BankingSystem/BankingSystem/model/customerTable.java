package com.BankingSystem.BankingSystem.model;

public class customerTable {


    String Name;
    String Email;
    int Account_NUmber;
    int current_balance;
    public customerTable(String name, String email, int account_NUmber, int current_balance) {
        Name = name;
        Email = email;
        Account_NUmber = account_NUmber;
        this.current_balance = current_balance;
    }
    public customerTable() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAccount_NUmber() {
        return Account_NUmber;
    }

    public void setAccount_NUmber(int account_NUmber) {
        Account_NUmber = account_NUmber;
    }

    public int getCurrent_balance() {
        return current_balance;
    }

    public void setCurrent_balance(int current_balance) {
        this.current_balance = current_balance;
    }


}
