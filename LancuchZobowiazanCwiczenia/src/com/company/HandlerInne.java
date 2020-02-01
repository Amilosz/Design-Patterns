package com.company;

public class HandlerInne extends Handler {
    public void modify(String category, String napis){
        if (category=="inne")
        {

        }
        else
            next.modify(category, napis);
    }
}
