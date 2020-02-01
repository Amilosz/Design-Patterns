package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class APINowyYork {
    List<String> gieldy = new LinkedList<String>();
    public APINowyYork(){
        gieldy.add("ABCDEF2");
        gieldy.add("ABCDEF4");
        gieldy.add("ABCDEF3");
        gieldy.add("ABCDEF1");
    }
    public Integer companyTrustworthy(String code, Integer days) {
        if (gieldy.contains(code))
        {
            Random gen = new Random();
            return gen.nextInt(100);
        }
        else
        {
            return -1;
        }
    }

}
