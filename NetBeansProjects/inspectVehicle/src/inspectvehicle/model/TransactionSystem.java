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
public class TransactionSystem {
    int cost;
    public TransactionSystem(){
        
    }
    
    public static int getCost(CheckListDTO checkList){
        int sum=0;
        if (checkList.isToCheckWheel()) sum+=150;
        if (checkList.isToCheckBreaks()) sum+=100;
        if (checkList.isToCheckDoors()) sum+=50;
        if (checkList.isToCheckEngine()) sum+=200;
        if (checkList.isToCheckKeys()) sum+=100;
        if (checkList.isToCheckGear()) sum+=300;

        return sum;
    }
    
    
}
