// Rekommenderat filnamn: Personer.java 
import java.io.*;

class Personer {
  public static void main(String[] arg) throws IOException {
    var input = new BufferedReader
               (new InputStreamReader(System.in));
    PrintWriter utström = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter("personer.txt", true)));
    while(true) {
      System.out.print("Skriv ett nytt namn? ");
      String namn = input.readLine();
      if (namn == null)
        break;
      utström.println(namn);
    }       
    utström.close();
  }      
}

