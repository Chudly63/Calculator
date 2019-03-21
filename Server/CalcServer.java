import java.net.*;

public class CalcServer{
    public static void main(String [] args) throws Exception{
        ServerSocket server = new ServerSocket(2400);

        while(true){
            Socket client = server.accept();

            RequestHandler rh = new RequestHandler(client);
            rh.start();
        }
    }
}