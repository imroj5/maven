package org.example;

import org.example.notification.Emailservice;
import org.example.notification.NotificationService;
import org.example.notification.PopupService;
import org.example.notification.SmsService;

public class orderservice {

    NotificationService notification;
public orderservice(NotificationService notification){
        this.notification=notification;
}

    public void placeOrder(){
        System.out.println("order placed");

notification.sendNotification();


    }
}
