package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class orderS {

payment paid;

 @Autowired
public orderS(payment paid){
  this.paid=paid;
}




    public void oredertaken(){
    paid.paymentSuccess();
        System.out.println("oder is processed");


    }
}
