package org.example.notification;

public class Emailservice implements NotificationService  {

    @Override
    public void sendNotification(){
        System.out.println("email is sent to the customer");
    }
}
