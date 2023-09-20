package com.BankingSystem.BankingSystem.model;

public class transferTable {

    String Candidate1;
    String Candidate2;
    int Transfer_Amount;

    public transferTable(String candidate1, String candidate2, int Transfer_Amount) {
        Candidate1 = candidate1;
        Candidate2 = candidate2;
        this.Transfer_Amount = Transfer_Amount;
    }
    public transferTable() {
    }
    public String getCandidate1() {
        return Candidate1;
    }

    public void setCandidate1(String candidate1) {
        Candidate1 = candidate1;
    }

    public String getCandidate2() {
        return Candidate2;
    }

    public void setCandidate2(String candidate2) {
        Candidate2 = candidate2;
    }

    public int getTransfer_Amount() {
        return Transfer_Amount;
    }

    public void setTransfer_Amount(int Transfer_Amount) {
        Transfer_Amount = Transfer_Amount;
    }





}
