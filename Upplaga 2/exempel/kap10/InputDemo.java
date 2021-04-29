import java.io.*;
class InputDemo {
  public static void main(String[] arg) throws IOException{
    var input = new BufferedReader
               (new InputStreamReader(System.in));
    System.out.println("Vad heter du?");
    String s = input.readLine();
    System.out.println("Hej " + s + "!");
  }
}