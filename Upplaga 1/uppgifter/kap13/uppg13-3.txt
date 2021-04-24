// Filen RatTal.java

public class RatTal {
  int tälj;   // täljaren
  int nämn;   // nämnaren
}


// Filen RatTalTest.java

public class RatTalTest { 

  public static void main(String[] arg) {
     RatTal r1 = new RatTal();
     RatTal r2 = new RatTal();
     RatTal r3 = new RatTal();
     r1.tälj = 5; r1.nämn = 9;
     r2.tälj = 1; r2.nämn = 3; 
     r3.tälj = 7; r3.nämn = 12;     
  }
}

