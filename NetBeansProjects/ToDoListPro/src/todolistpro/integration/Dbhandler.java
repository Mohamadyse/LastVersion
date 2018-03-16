/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolistpro.integration;

import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import todolistpro.model.TaskList;


/**
 *
 * @author mohamad
 */
public class Dbhandler {

    public static String fileName = "toDoList.data";//path
//    private TaskList taskList;
    private File theFile;
    
    public Dbhandler() throws IOException, FileNotFoundException, ClassNotFoundException {
       File theFile= new File(fileName);
        if (!theFile.exists()) {
            saveToFile(new TaskList());
      }
  //    this.taskList = readFromFile();
      
    }
      

  
    
    public TaskList readFromFile() throws FileNotFoundException, IOException, ParseException  {
      //  File source = new File(fileName);
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
        TaskList savedList = new TaskList();
        try {
            savedList = (TaskList) is.readObject();
        } catch (ClassNotFoundException ex) { System.out.println("nothing theeeeeere");
            Logger.getLogger(Dbhandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        is.close();
//       if (savedList==null) 
//          savedList.addTask( " empty ","11.11.1111"," empty "," empty");
 if (savedList == null) 
    savedList = new TaskList();
        return savedList;
    }
    
    public void saveToFile(TaskList taskListToSave) throws FileNotFoundException, IOException {
      //  File newFile = new File(someFile);
        ObjectOutputStream outs = new ObjectOutputStream(new FileOutputStream(fileName));
        outs.writeObject(taskListToSave);
        outs.close();
    }     

}
