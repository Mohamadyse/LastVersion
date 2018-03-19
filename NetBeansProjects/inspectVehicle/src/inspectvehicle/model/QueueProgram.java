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
public class QueueProgram {
    private Door door = new Door();
    private QueueNumberDisplay queueNumDisp = new QueueNumberDisplay();

    /**
     * Creates an instance and connects to the door and queue number display.
     */
    public QueueProgram() {
    }

    /**
     * Opens the door and displays the next queue number.
     */
    public void nextCustomer() {
        door.open();
        queueNumDisp.nextNumber();
    }

    /**
     * Closes the door
     */
    public void closeDoor() {
        door.close();
    }

}