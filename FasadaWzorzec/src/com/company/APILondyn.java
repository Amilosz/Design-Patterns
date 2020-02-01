package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class APILondyn {
    List<String> gieldy = new LinkedList<String>();

    public APILondyn() {
        gieldy.add("ABCDEF1");
        gieldy.add("ABCDEF5");
        gieldy.add("ABCDEF3");
    }

    public Integer getRisk(String code, Integer days) {
        if (gieldy.contains(code)) {
            Random gen = new Random();
            return gen.nextInt(100);
        }
        else
            return -1;
    }
}
