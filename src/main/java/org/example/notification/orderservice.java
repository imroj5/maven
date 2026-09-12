package org.example.notification;

public class orderservice {

   NotificationService notification;

public orderservice(NotificationService notification){
        this.notification=notification;
}
//empty constructor
public orderservice (){

}
    public void placeOrder(){
        System.out.println("order placed");

notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
