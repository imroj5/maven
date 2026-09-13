package org.example;

import org.example.notification.Emailservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


  public  static void main(String[] args) {

      ApplicationContext contexts = new AnnotationConfigApplicationContext(AppConfig.class);

      orderS orde= contexts.getBean(orderS.class);
      orde.oredertaken();
    //  upiPayment paisa=contexts.getBean(upiPayment.class);
      //paisa.upipay();
        }

}
