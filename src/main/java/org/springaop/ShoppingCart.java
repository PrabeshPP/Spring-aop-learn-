package org.springaop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    //Logging
    //Authentication
    //Sanitize the Data
    public void checkout(){
        System.out.println("Transaction has been completed.");
    }
}
