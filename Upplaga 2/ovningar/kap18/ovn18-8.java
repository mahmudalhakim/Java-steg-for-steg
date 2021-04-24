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


/// Filen SkapaLager3.java

import java.io.*;
import java.util.*;
import com.fasterxml.jackson.databind.*;

class SkapaLager3 {
  public static void main(String[] arg) throws IOException {
    var m = new HashMap<Integer, Item>();
    var scan = new Scanner(System.in);
    int n = 0;
    System.out.println("Ange artikelnummer, namn och pris (exkl. moms):");
    while(scan.hasNextLine()) { 
      m.put(scan.nextInt(), new Item(scan.next(), scan.nextDouble()));
      scan.nextLine();
    }      
    var mapper = new ObjectMapper();
    mapper.writeValue(new File("lager3.json"), m);
  }
}

// Filen SokVara3.java

import java.util.*;
import java.io.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.type.*; 

class SokVara3 {
  public static void main(String[] arg) throws IOException {
    var mapper = new ObjectMapper();
    var typ = new TypeReference<Map<Integer, Item>>(){};
    Map<Integer, Item> m = mapper.readValue(new File("lager3.json"), typ);  
    var scan = new Scanner(System.in);
    while(true) {     
      System.out.print("Vilken vara söker du? ");
      if (!scan.hasNextInt())
        break;
      // Leta efter varan i tabellen m
      int nr = scan.nextInt();
      Item it = m.get(nr);
      if (it != null)  // varan hittades
        System.out.println(it.getName() + ", Pris (exkl. moms): " + it.getPrice());
      else
        System.out.println("Kunde inte hitta " + nr);
    } 
  }
