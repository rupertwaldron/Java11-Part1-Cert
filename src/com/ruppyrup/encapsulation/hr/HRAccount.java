package com.ruppyrup.encapsulation.hr;

import com.ruppyrup.encapsulation.accts.Account;
import com.ruppyrup.encapsulation.newhr.NewHRAcount;

public class HRAccount extends Account {

    public static void main(String[] args) {
        NewHRAcount newHRAcount = new NewHRAcount();
        newHRAcount.acctId = "111"; // will compile as access it's own member
        //newHRAcount.name = "Bob"; // wont compile because name is defined in NewHRAccount and therefor
        // HRAccount does not own this field

    }
}
