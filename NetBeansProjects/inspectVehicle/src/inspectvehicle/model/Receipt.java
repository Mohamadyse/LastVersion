/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.model;

/**
 *
 * @author mohamad
 */
public class Receipt {
    
   public static void print(int cost,boolean status) {
       System.out.println("Here is the receipt : ");
       if (status) {
           System.out.println("it has been paid : " + cost + " successfully ");
       }
       else System.out.println("Opps, somethig went wrong");
   }
    
    
    
}
