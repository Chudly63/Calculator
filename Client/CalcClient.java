import java.io.*;
import java.net.*;

public class CalcClient{
    private Socket socket;
    private ObjectInputStream myInput;
    private ObjectOutputStream myOutput;

    public void sendToServer(EquationItem root){
        try{
            socket = new Socket("localhost", 2400);

            myOutput = new ObjectOutputStream(socket.getOutputStream());
            myInput = new ObjectInputStream(socket.getInputStream());

            myOutput.writeObject(root);

            myInput.close();
            myOutput.close();
            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}