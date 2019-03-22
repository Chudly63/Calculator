/*
CalcServer.java
Alex M Brown

Server for reading and storing equations.
*/

import java.net.*;
import java.io.*;

public class CalcServer{
    public static void main(String [] args) throws Exception{
        ServerSocket server = new ServerSocket(2400);
        ServerControl control = new ServerControl();

        control.start();

        while(true){
            Socket myClient = server.accept();
            try{
                ObjectInputStream myInput = new ObjectInputStream(myClient.getInputStream());
                PrintWriter myWriter = new PrintWriter(new FileOutputStream("History.log", true));
                PrintWriter myTreeWriter = new PrintWriter(new FileOutputStream("Trees.log", true));
                
                Object read;
                EquationItem root;
                String message;
    
                VisitorFullPrint printer = new VisitorFullPrint();
                VisitorCalculate calculate = new VisitorCalculate();
                VisitorTreePrint treePrinter = new VisitorTreePrint();
    
                try{
                    read = myInput.readObject();
                    root = (EquationItem)read;
                    message = root.accept(printer) + "= " + root.accept(calculate);
                    myWriter.println(message);
                    myWriter.close();

                    myTreeWriter.println(root.accept(treePrinter) + "\n");
                    myTreeWriter.close();
    
                }catch(Exception e){
                    e.printStackTrace();
                }
                
    
            }catch(IOException e){e.printStackTrace();}
        }
    }
}