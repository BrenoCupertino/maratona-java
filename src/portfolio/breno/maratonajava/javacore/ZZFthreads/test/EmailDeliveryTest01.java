package portfolio.breno.maratonajava.javacore.ZZFthreads.test;

import portfolio.breno.maratonajava.javacore.ZZFthreads.dominio.Members;
import portfolio.breno.maratonajava.javacore.ZZFthreads.service.DeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        new Thread(new DeliveryService(members), "Thread 1").start();
        new Thread(new DeliveryService(members), "Thread 2").start();

        while(true){
            String email = JOptionPane.showInputDialog("Digite seu email: ");
            if(email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMember(email);
        }
    }
}
