class Fordon {
  int vikt;
  
  Fordon (int v) {
    vikt = v;
  }

  void skrivInfo() {
    System.out.println("Ett fordon med vikten " + vikt);
  }
}

class Cykel extends Fordon {
  String fabrikat;
  int antalV�xlar;
  boolean harElmotor;
  
  Cykel (int v, String fab, int v�x, boolean el) {
    super(v);
    fabrikat = fab;
    antalV�xlar = v�x;
    harElmotor = el;
  }

  void skrivInfo() {
    System.out.println("En Cykel av fabrikatet " + fabrikat);
  }
  
}

var f = new Fordon(1000);
var c = new Cykel(15, "Monark", 5, false);