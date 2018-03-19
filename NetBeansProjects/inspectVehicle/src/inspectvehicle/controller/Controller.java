/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.controller;

import inspectvehicle.integration.VehicleInspectionsRegisty;
import inspectvehicle.model.CheckListDTO;

/**
 *
 * @author mohamad
 */
public class Controller {

    public Controller() {
    }

    public int checkInspection(int RegNo) {

        VehicleInspectionsRegisty vehicleData = new VehicleInspectionsRegisty();
        CheckListDTO checkList= vehicleData.checkInspectionList(RegNo);
        

      return  transc.getCost(checkList);
    }

//    public void startNewInspection(){
//        
//
//        
//    }
//         vehicleData.checkInspection(nummber);
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
