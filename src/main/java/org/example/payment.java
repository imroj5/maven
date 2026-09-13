package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class payment {
    private upiPayment ups;
@Autowired
    public payment(upiPayment ups) {
        this.ups = ups;
    }

    public void paymentSuccess(){
    ups.upipay();
        System.out.println("payment is done ");
    }
}
