import java.util.*;
class Hej2 {
  public static void main (String[] arg) {
    String namn;
    String hälsning;
    System.out.print("Vad heter du? ");
    Scanner scan = new Scanner(System.in);
    namn = scan.nextLine();
    hälsning = "Välkommen " + namn;
    System.out.println(hälsning);
  }
}