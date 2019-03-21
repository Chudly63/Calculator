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