/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.controller;

import inspectvehicle.integration.VehicleInspectionsRegisty;
import inspectvehicle.model.CheckListDTO;
import inspectvehicle.model.Payment;
import util.Printer;
import inspectvehicle.model.TransactionSystem;

/**
 *
 * @author mohamad
 */
public class Controller {
 private int cost; 
 CheckListDTO checkList;
    public Controller() {
    }
  
    public int checkInspection(String regNo) {
        CheckListDTO checkList= getCheckList(regNo);
      return  this.cost= TransactionSystem.getCost(checkList);
    }


    private CheckListDTO getCheckList(String regNo) {
        VehicleInspectionsRegisty vehicleData = new VehicleInspectionsRegisty();
        CheckListDTO checkList = vehicleData.getInspectionList(regNo);
        return this.checkList=checkList;
    }
    
    public CheckListDTO getCheckList() {
        return checkList;
    }

    public boolean payCard(){
        System.out.println("insert your card please");
        return Payment.pay(cost);
    }
    
    
    public void ShowCheckList(){
        Printer.printSpecification(checkList);
    }
    
}