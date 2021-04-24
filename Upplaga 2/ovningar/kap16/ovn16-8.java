// Filen Item.java

public class Item {
  private String name;
  private double price;
  private static double vat;
  
  public Item() {}

  public Item(String n, double p) {
    setName(n);
    setPrice(p);
  }

  public void setName(String n) {
    if (n != null)
      name = n;
    else
      throw new NullPointerException();
  }

  public void setPrice(double p) {
    if (p >= 0)
      price = p;
    else
      throw new IllegalArgumentException("Felaktigt price");
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public double sellingPrice() {
    return price * (1 + vat/100);
  }

  public static void setVat(double m) {
    if (m >= 0)
      vat = m;
    else
      throw new IllegalArgumentException("Illegal vat");
  } 
}   


// Filen SkapaLager.java

import java.io.*;
import java.util.*;
import com.fasterxml.jackson.databind.*;

class SkapaLager {
  public static void main(String[] arg) throws IOException {
    var a = new Item[100];
    var scan = new Scanner(System.in);
    int n = 0;
    System.out.println("Ange namn och pris (exkl. moms):");
    while(scan.hasNextLine()) { 
      a[n++] = new Item(scan.next(), scan.nextDouble());
      scan.nextLine();
    }      
    Item[] varor = Arrays.copyOf(a, n);
    var mapper = new ObjectMapper();
    mapper.writeValue(new File("lager.json"), varor);
  }
}

// Filen SokVara.java

import java.util.*;
import java.io.*;
import com.fasterxml.jackson.databind.*;

class SokVara {
  public static void main(String[] arg) throws IOException {
    var mapper = new ObjectMapper();
    Item[] a = mapper.readValue(new File("lager.json"), Item[].class);  
    var scan = new Scanner(System.in);
    while(true) {     
      System.out.print("Vilken vara söker du? ");
      if (!scan.hasNextLine())
        break;
      String sökt = scan.nextLine();
      // Leta efter varan i arrayen a
      int i = 0;
      for (; i<a.length; i++) 
        if (a[i].getName().equals(sökt))
          break;
      if (i < a.length)  // varan hittades
        System.out.println("Pris (exkl. moms): " + a[i].getPrice());
      else
        System.out.println("Kunde inte hitta " + sökt);
    } 
  }
}