package com.company;

public class HandlerWazne extends Handler {
    public void modify(String category, String napis){
        if (category=="wazne")
        {
            napis=napis + "To wazne!";
        }
        else
            next.modify(category,napis);
    }
}
