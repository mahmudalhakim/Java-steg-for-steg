class PersonDemo {
  public static void main(String[] arg) {
    var p = new Person();
    p.f�rnamn = "Kalle";
    p.efternamn = "Nilson";
    p.f�dd�r = 2001;
    String s = p.f�rnamn + ", f�dd �r "+ p.f�dd�r +", �r ";
    if (!p.singel)
      s = s + " inte "; 
    s = s + " singel";
    System.out.println(s);
  }
}

class Person {
  String f�rnamn;
  String efternamn;
  int f�dd�r;
  boolean singel = true;
}
