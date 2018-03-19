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
public class CheckListDTO {

    private boolean toCheckWheel;
    private boolean toCheckDoors;
    private boolean toCheckEngine;
    private boolean toCheckVexel;
    private boolean toCheckBreaks;
    private boolean toCheckKeys;

    public CheckListDTO(boolean toCheckWheel, boolean toCheckDoors, boolean toCheckEngine, boolean toCheckVexel, boolean toCheckBreaks, boolean toCheckKeys) {

        this.toCheckWheel = toCheckWheel;
        this.toCheckDoors = toCheckDoors;
        this.toCheckEngine = toCheckEngine;
        this.toCheckVexel = toCheckVexel;
        this.toCheckBreaks = toCheckBreaks;
        this.toCheckKeys = toCheckKeys;

    }

    public boolean isToCheckWheel() {
        return toCheckWheel;
    }

    public void setToCheckWheel(boolean toCheckWheel) {
        this.toCheckWheel = toCheckWheel;
    }

    public boolean isToCheckDoors() {
        return toCheckDoors;
    }

    public void setToCheckDoors(boolean toCheckDoors) {
        this.toCheckDoors = toCheckDoors;
    }

    public boolean isToCheckEngine() {
        return toCheckEngine;
    }

    public void setToCheckEngine(boolean toCheckEngine) {
        this.toCheckEngine = toCheckEngine;
    }

    public boolean isToCheckVexel() {
        return toCheckVexel;
    }

    public void setToCheckVexel(boolean toCheckVexel) {
        this.toCheckVexel = toCheckVexel;
    }

    public boolean isToCheckBreaks() {
        return toCheckBreaks;
    }

    public void setToCheckBreaks(boolean toCheckBreaks) {
        this.toCheckBreaks = toCheckBreaks;
    }

    public boolean isToCheckKeys() {
        return toCheckKeys;
    }

    public void setToCheckKeys(boolean toCheckKeys) {
        this.toCheckKeys = toCheckKeys;
    }

}
