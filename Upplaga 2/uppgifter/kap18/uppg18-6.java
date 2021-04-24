import java.util.*;

class TillMorse implements MorseData {
  public static void main(String[] arg) {  
    var tab = new HashMap<Character, String>();
    for (int i = 0; i<morse.length; i++)
      tab.put(bokst.charAt(i), morse[i]); 
    var scan = new Scanner(System.in);
    String s = scan.nextLine();
    for (int i = 0; i<s.length(); i++) 
        System.out.print(tab.getOrDefault(s.charAt(i), " ") + " ");
    System.out.println();
  }
}

class FranMorse implements MorseData  {
  public static void main(String[] arg) {   
    var tab = new HashMap<String, Character>();
    for (int i = 0; i<morse.length; i++)
      tab.put(morse[i], bokst.charAt(i)); 
    var scan = new Scanner(System.in);
    while (scan.hasNext()) 
       System.out.print(tab.getOrDefault(scan.next(), '?'));
    System.out.println();
  }
}

interface MorseData {
  String[] morse = {".-",    "-...",  "-.-.", "-..",  ".",    "..-.",
                    "--.",   "....",  "..",   ".---", "-.-",  ".-..",
                    "--",    "-.",    "---",  ".--.", "--.-", ".-.",
                    "...",   "-",    "..-",  "...-", ".--",  "-..-",
                    "-.--",  "--..",  ".--.-",".-.-", "---." };
  String bokst = "abcdefghijklmnopqrstuvwxyzåäö";
}
  



  