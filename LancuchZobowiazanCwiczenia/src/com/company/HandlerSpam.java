package com.company;

public class HandlerSpam extends Handler {
    public void modify(String category, String napis){
        if (category=="spam")
        {
            napis = napis + "To spam!";
        }
        else
            next.modify(category);
    }
}
