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
    
    public int getCost(CheckListDTO checkList){
        int sum=0;
        if (checkList.isToCheckWheel()) sum+=100;
        if (checkList.isToCheckBreaks()) sum+=100;
        if (checkList.isToCheckWheel()) sum+=100;
        if (checkList.isToCheckWheel()) sum+=100;
        if (checkList.isToCheckWheel()) sum+=100;
        if (checkList.isToCheckWheel()) sum+=100;
        if (checkList.isToCheckWheel()) sum+=100;
        
        
        return 
    }
    
    
}
