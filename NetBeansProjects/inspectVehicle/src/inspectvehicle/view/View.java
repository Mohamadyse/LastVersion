/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectvehicle.view;

import inspectvehicle.controller.Controller;

import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author mohamad
 */
public class View {
    private Controller contr;
    Scanner reader=new Scanner(System.in);
    
    
    
    public View(Controller contr){
        this.contr=contr;
    }
    
        public int register(int nummber ){
            
        return  contr.checkInspection(nummber);
    }
}
