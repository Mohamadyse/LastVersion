/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.view;

import inspectvehicle.controller.Controller;
import java.util.Scanner;
 

/**
 *
 * @author mohamad
 */
public class View {

    private Controller contr;
  

    public View(Controller contr) {
        this.contr = contr;
        register();
    }

    private void register() {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter the vehicle registration number");
        String regNo = reader.next();
        int cost = contr.checkInspection(regNo);
        System.out.println("the cost of inspection is: " + cost );
        
    }
 
    public void toPay(){
        contr.payCard();
    }
        
}
