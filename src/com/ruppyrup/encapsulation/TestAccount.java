package com.ruppyrup.encapsulation;

import com.ruppyrup.encapsulation.accts.Account;
import com.ruppyrup.encapsulation.hr.HRAccount;
import com.ruppyrup.encapsulation.newhr.NewHRAcount;

public class TestAccount extends NewHRAcount {
    String myName = name;
//    String result = getName();

    public static void main(String[] args) {
        Account account = new Account();
        HRAccount hrAccount = new HRAccount();
        NewHRAcount newHRAcount = new NewHRAcount();
        newHRAcount.bob();

//
//        System.out.println(newHRAcount.getName());
//        System.out.println(newHRAcount.getManager());
//        System.out.println(newHRAcount.getAcctId());

    }
}
