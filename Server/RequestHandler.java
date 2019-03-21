import java.net.*;
import java.io.*;

public class RequestHandler extends Thread{
    private Socket myClient = null;

    public RequestHandler(Socket client){
        myClient = client;
    }

    public void run(){
        try{
            ObjectOutputStream myOutput = new ObjectOutputStream(myClient.getOutputStream());
            ObjectInputStream myInput = new ObjectInputStream(myClient.getInputStream());

            Object read;
            EquationItem root;

            VisitorFullPrint printer = new VisitorFullPrint();
            VisitorCalculate calculate = new VisitorCalculate();

            try{
                read = myInput.readObject();
                root = (EquationItem)read;
                System.out.println(root.accept(printer) + "= " + root.accept(calculate));

            }catch(Exception e){
                e.printStackTrace();
            }


        }catch(IOException e){e.printStackTrace();}
    }
}