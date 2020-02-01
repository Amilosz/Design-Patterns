package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class APISingapur {
    List<String> gieldy = new LinkedList<String>();
    public APISingapur(){
        gieldy.add("ABCDEF3");
        gieldy.add("ABCDEF1");
        gieldy.add("ABCDEF5");
    }
    public boolean checkCompany(String code) {
        if (gieldy.contains(code))
            return true;
        else
            return false;
    }

    public Integer getCompanyRisk(String code, Integer months) {
        if (gieldy.contains(code))
        {
            Random gen = new Random();
            return gen.nextInt(100);
        }
        else
            return -1;
    }

}
