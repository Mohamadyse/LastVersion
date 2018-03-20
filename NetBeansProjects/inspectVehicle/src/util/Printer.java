/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import inspectvehicle.model.CheckListDTO;

/**
 *
 * @author mohamad
 */
public class Printer {

    public static void printReceipt(int cost, boolean status) {
        System.out.println("Here is the receipt : ");
        if (status) {
            System.out.println("it has been paid : " + cost + " successfully ");
        } else {
            System.out.println("Opps, somethig went wrong");
        }
    }

    public static void printSpecification(CheckListDTO checkList) {
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
