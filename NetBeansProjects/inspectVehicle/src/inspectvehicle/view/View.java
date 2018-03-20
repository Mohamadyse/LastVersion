/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.view;

import inspectvehicle.controller.Controller;
import inspectvehicle.model.CheckListDTO;
import java.util.Scanner;
 

/**
 *
 * @author mohamad
 */
public class View {

    private Controller contr;
  

    public View(Controller contr) {
        this.contr = contr;
    }

    public void register() {
       
        String regNo =  typeRegNo();
        int cost = contr.checkInspection(regNo);
        System.out.println("the cost of inspection is: " + cost );
    }
    
    private String typeRegNo(){
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter the vehicle registration number");
        return  reader.next();
    }
 
  
    public void toPay(){
        contr.payCard();
    }
        
   
        public void setResult(CheckListDTO checkList) {
        int i=1;
            if (checkList.isToCheckBreaks()) {
            System.out.println(i+". Check the bearks");
            i++;
        }
        if (checkList.isToCheckDoors()) {
           System.out.println(i+". Check the doors");
            i++;
        }

        if (checkList.isToCheckEngine()) {
         System.out.println(i+". Check the engine");
            i++;          
            }
        
        if (checkList.isToCheckGear()) {
         System.out.println(i+". Check the gearbox");
            i++;                   
        }
        if (checkList.isToCheckKeys()) {
         System.out.println(i+". Check the keys");
            i++;           
                    
        }
        if (checkList.isToCheckWheel()) {
         System.out.println(i+". Check the wheels");
            i++;                           
   
        }
    }
   }