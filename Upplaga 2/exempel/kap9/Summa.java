import java.util.*; 
class Summa {
  public static void main(String[] arg) {
    var scan = new Scanner(System.in);
    System.out.println
           ("Skriv ett antal heltal. Avsluta med Ctrl-Z");
    int sum = 0;       // summan av talen
    while (scan.hasNextInt()) {   // finns det fler tal?
      int i = scan.nextInt();     // ja, läs nästa tal
      sum = sum + i;
    }
    System.out.println("Summa: " + sum);
  }      
}