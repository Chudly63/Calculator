/*
ServerControl.java
Alex M Brown

Control system that allows the user to view and equation history and count.
*/

import java.io.*;
import java.util.*;
public class ServerControl extends Thread{

    public ArrayList<String> getHistory(){
        try{
            ArrayList<String> history = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader("History.log"));
            String currentLine = br.readLine();
            while(currentLine != null){
                history.add(currentLine);
                currentLine = br.readLine();
            }
            br.close();
            return history;
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public void run(){
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        String command = "";

        System.out.println("ALEX BROWN'S CALCULATOR SERVER\n-----------------------------------------");

        while(true){
            System.out.println("Controls: C = Display Count | H = Display History | X = Clear History");
            try{
                command = myReader.readLine().toUpperCase();
                if(command.equals("C")){
                    System.out.println("Number of equations: " + getHistory().size());
                }
                if(command.equals("H")){
                    ArrayList<String> myHistory = getHistory();
                    System.out.println("HISTORY");

                    for(int i=0; i<myHistory.size(); i++){
                        System.out.println(myHistory.get(i));
                    }
                }
                if(command.equals("X")){
                    PrintWriter deleter = new PrintWriter("History.log");
                    deleter.write("");
                    deleter.close();
                }
            }catch(Exception e){}
        }
    }
}