package com.BankingSystem.BankingSystem.controller;

import com.BankingSystem.BankingSystem.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customertable")
public class bankingCustomer {
    ArrayList<customerTable> list = new ArrayList<>();

    public bankingCustomer(){
        customerTable c1 = new customerTable("abc", "abc", 1234167, 8000000);
        customerTable c2 = new customerTable("ab", "abc", 2345, 8000000);
        customerTable c3 = new customerTable("a1", "abc", 1234, 8000000);
        customerTable c4 = new customerTable("a2", "abc", 1234, 8000000);
        customerTable c5 = new customerTable("a3", "abc", 1234, 8000000);
        customerTable c6 = new customerTable("a4", "abc", 1234, 8000000);
        customerTable c7 = new customerTable("a5", "abc", 1234, 8000000);
        customerTable c8 = new customerTable("a6", "abc", 1234, 8000000);
        customerTable c9 = new customerTable("a7", "abc", 1234, 8000000);
        customerTable c10 = new customerTable("a8", "abc", 1234, 8000000);

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);
        list.add(c8);
        list.add(c9);
        list.add(c10);
    }

    ArrayList<transfer>list1=new ArrayList<>();
    @GetMapping()
    public CustomerDetailsResponse getCustomerTableDetails() {
       // ArrayList<customerTable> list = new ArrayList<>();


        CustomerDetailsResponse customerDetailsResponse = new CustomerDetailsResponse();
        customerDetailsResponse.setCustomerList(list);
        return customerDetailsResponse;
    }

  @PostMapping()
    public void transfer(@RequestBody theCandidatesWhoseContentHasToTransfer cand){


        String candidate1=cand.candi1;
        String candidate2=cand.candi2;
        int Transfer_Amount=cand.A;
        customerTable cc=geTheCandidateWhoHasToTransferMoney(candidate1);
        customerTable bb=geTheCandidateWhoHasToTakeMoney( candidate2);

        if(cc.getCurrent_balance()<Transfer_Amount){
            System.out.print("Invalid Transaction");
        }
        else{
            cc.setCurrent_balance(cc.getCurrent_balance()-Transfer_Amount);
           // transfer ta=new transfer(cc,bb,Transfer_Amount);

            bb.setCurrent_balance(bb.getCurrent_balance()+Transfer_Amount);
            transfer ta=new transfer(cc,bb,Transfer_Amount);
            list1.add(ta);



        }



    }

    private customerTable geTheCandidateWhoHasToTransferMoney(String a) {
        for(int i=0;i< list.size();i++){
            customerTable str2= list.get(i);
            if(a.equals(str2.getName())){
                return str2;
            }
        }
        customerTable c2=new customerTable(null,null,0,0);
        return c2;
    }
    private customerTable geTheCandidateWhoHasToTakeMoney(String b){
        for(int i=0;i< list.size();i++){
            customerTable str2= list.get(i);
            if(b.equals(str2.getName())){
                return str2;
            }
        }
        customerTable c2=new customerTable(null,null,0,0);
        return c2;

    }

    @GetMapping("transferTableDetails")
    public transferlist transferTable1(){

        transferlist t = new transferlist();
        t.setLi2(list1);
        return t;
    }

}
