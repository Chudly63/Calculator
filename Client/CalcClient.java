/*
CalcClient.java
Alex M Brown

Connects to the Server and sends the Equation object
*/

import java.io.*;
import java.net.*;

public class CalcClient{
    private Socket socket;
    private ObjectOutputStream myOutput;

    public void sendToServer(EquationItem root){
        try{
            socket = new Socket("localhost", 2400);

            myOutput = new ObjectOutputStream(socket.getOutputStream());

            myOutput.writeObject(root);

            myOutput.close();
            socket.close();
        }catch(ConnectException e){
            System.out.println("Connection Failed");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}