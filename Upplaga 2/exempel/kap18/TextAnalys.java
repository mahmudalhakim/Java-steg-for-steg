import java.util.*;
import java.text.*;
import java.io.*;

class TextAnalys  {
  public static void main(String[] arg)throws IOException{
    var scan = new Scanner(System.in);
    System.out.print("Filnamn? ");
    String namn = scan.next(); 
    var fil = new Scanner(new File(namn));
    Collator co = Collator.getInstance();  
    co.setStrength(Collator.PRIMARY); 
    var tab = new TreeMap<String,Integer>(co);
    
     // läs ett ord i taget och addera till tabellen
    while(fil.hasNext()) {
      String ord = fil.next();
      tab.putIfAbsent(ord, 0);      // om ordet inte fanns
      tab.put(ord, tab.get(ord)+1); // öka antalet med ett
    }
    System.out.println(tab);        // skriv ut tabellen
  }
}