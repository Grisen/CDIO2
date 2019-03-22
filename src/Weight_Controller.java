import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Weight_Controller {
    public void Weight_Connection() throws InterruptedException {
        try {
            Socket socket = new Socket("localhost",8000);
            OutputStream sos = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(sos);
            InputStream is = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            pw.println("RM20 4 INDTAST");
            pw.flush();
            Boolean got_input = false;
            String in ="";
            do{

                in = reader.readLine();

                if(in.equals("")); //do nothing
                else got_input = true;

            }while(!got_input);

            System.out.println(in);

            //socket.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}