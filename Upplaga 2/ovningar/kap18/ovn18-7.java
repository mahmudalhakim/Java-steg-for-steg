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


// Filen SkapaLager2.java

import java.io.*;
import java.util.*;
import com.fasterxml.jackson.databind.*;

class SkapaLager2 {
  public static void main(String[] arg) throws IOException {
    var l = new ArrayList<Item>();
    var scan = new Scanner(System.in);
    int n = 0;
    System.out.println("Ange namn och pris (exkl. moms):");
    while(scan.hasNextLine()) { 
      l.add(new Item(scan.next(), scan.nextDouble()));
      scan.nextLine();
    }      
    var mapper = new ObjectMapper();
    mapper.writeValue(new File("lager2.json"), l);
  }
}

// Filen SokVara2.java

import java.util.*;
import java.io.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.type.*; 

class SokVara2 {
  public static void main(String[] arg) throws IOException {
    var mapper = new ObjectMapper();
    var typ = new TypeReference<List<Item>>(){};
    List<Item> l = mapper.readValue(new File("lager2.json"), typ);  
    var scan = new Scanner(System.in);
    while(true) {     
      System.out.print("Vilken vara söker du? ");
      if (!scan.hasNextLine())
        break;
      String sökt = scan.nextLine();
      // Leta efter varan i arrayen a
      Item it = null;
      for (Item i : l) 
        if (i.getName().equals(sökt)) {
          it = i;
          break;
        }
      if (it != null)  // varan hittades
        System.out.println("Pris (exkl. moms): " + it.getPrice());
      else
        System.out.println("Kunde inte hitta " + sökt);
    } 
  }
}