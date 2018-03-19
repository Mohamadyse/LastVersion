/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.integration;

import inspectvehicle.model.CheckListDTO;
import java.util.Random;

/**
 *
 * @author mohamad
 */
public class VehicleInspectionsRegisty {
   
    
    public CheckListDTO checkInspectionList(String regNo){
        Random creator = new Random();
        CheckListDTO checkList = new CheckListDTO(creator.nextBoolean(), creator.nextBoolean(), creator.nextBoolean(), creator.nextBoolean(), creator.nextBoolean(), creator.nextBoolean());
        return checkList;
    }
}
