import java.util.*;

class Rom {
  public static void main(String[] arg) {  
    var romSiff = new HashMap<Character, Integer>();
    romSiff.put('I', 1);
    romSiff.put('V', 5);
    romSiff.put('X', 10);
    romSiff.put('L', 50);
    romSiff.put('C', 100);
    romSiff.put('D', 500);
    romSiff.put('M', 1000);
    var scan = new Scanner(System.in);
    System.out.print("Ett romerskt tal? ");
    String s = scan.nextLine().toUpperCase();
    // Ta fram siffrorna i talet
    var siff = new ArrayList<Integer>();
    for (int i = 0; i<s.length(); i++)
      if (romSiff.containsKey(s.charAt(i)))
        siff.add(romSiff.get(s.charAt(i)));
    siff.add(0);   // l�gg till en extra nolla p� slutet
  System.out.println(siff);
    
    // Ber�kna talets v�rde
    int sum = 0;
    for (int i = 0; i < siff.size()-1; i++) 
      if (siff.get(i) >= siff.get(i+1))
        sum += siff.get(i);
      else
        sum -= siff.get(i);
    System.out.println("Talet �r: " + sum);
  }
}
    
    