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


upiPayment pas;
//@Autowired
    public orderS(upiPayment pas) {
        this.pas = pas;
    }

    public void oredertaken(){
    paid.paymentSuccess();
    //pas.upipay();
        System.out.println("oder is processed");


    }
}
