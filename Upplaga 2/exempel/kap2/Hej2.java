import java.util.*;
class Hej2 {
  public static void main (String[] arg) {
    String namn;
    String h�lsning;
    System.out.print("Vad heter du? ");
    Scanner scan = new Scanner(System.in);
    namn = scan.nextLine();
    h�lsning = "V�lkommen " + namn;
    System.out.println(h�lsning);
  }
}