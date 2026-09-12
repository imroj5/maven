package org.example.notification;

import org.springframework.stereotype.Component;

@Component
public class Emailservice  {


    public void sendNotification(){
        System.out.println("email is sent to the customer");
    }
}
