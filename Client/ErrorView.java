/*
ErrorView.java
Alex M Brown

Popup that alerts the user to invalid inputs
*/

import javax.swing.*;
import java.awt.event.*;

public class ErrorView{


    public ErrorView(){ }

    public static boolean isDiscarded(){
        if(JOptionPane.showConfirmDialog(null, "Invalid Operation. Discard?", "Error", JOptionPane.YES_NO_OPTION) == 1){
            return false;
        }
        else{
            return true;
        }
        
    }

}