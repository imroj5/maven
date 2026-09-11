package org.example;

import org.example.notification.Emailservice;
import org.example.notification.NotificationService;
import org.example.notification.PopupService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        NotificationService notification = new PopupService();
   orderservice delivery = new orderservice(notification);
   delivery.placeOrder();

        }

}
