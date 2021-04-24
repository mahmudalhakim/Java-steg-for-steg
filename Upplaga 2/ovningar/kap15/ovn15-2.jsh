class Cykel {
  String fabrikat;
  int antalVäxlar;
  boolean harElmotor;
}
var c = new Cykel[2];
for (int i=0; i<c.length; i++)
  c[i] = new Cykel();
c[0].fabrikat = "EcoRide"
c[0].antalVäxlar = 8
c[0].harElmotor = true
c[1].fabrikat = "Skeppshult"
c[2].antalVäxlar = 5
c[1].antalVäxlar = 5
c[1].harElmotor = false
for (int i = 0; i<c.length; i++)
  System.out.println(c[i].fabrikat + " " + c[i].antalVäxlar + " " + c[i].harElmotor);