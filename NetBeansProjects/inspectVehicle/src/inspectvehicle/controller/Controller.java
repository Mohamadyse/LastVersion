/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.controller;

import inspectvehicle.integration.VehicleInspectionsRegisty;
import inspectvehicle.model.CheckListDTO;
import inspectvehicle.model.Payment;
import inspectvehicle.model.TransactionSystem;

/**
 *
 * @author mohamad
 */
public class Controller {
 int cost;
    public Controller() {
    }
  
    public int checkInspection(String regNo) {
        CheckListDTO checkList=getCheckList(regNo);
      return  this.cost= TransactionSystem.getCost(checkList);
    }
    
    
    private CheckListDTO getCheckList(String regNo) {
        VehicleInspectionsRegisty vehicleData = new VehicleInspectionsRegisty();
        CheckListDTO checkList = vehicleData.checkInspectionList(regNo);
        return checkList;
    }
    
    public boolean payCard(){
        System.out.println("insert your card please");
        return Payment.pay(cost);
    }
    
    
}