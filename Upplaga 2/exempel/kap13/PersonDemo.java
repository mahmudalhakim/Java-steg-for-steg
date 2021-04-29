class PersonDemo {
  public static void main(String[] arg) {
    var p = new Person();
    p.förnamn = "Kalle";
    p.efternamn = "Nilson";
    p.föddÅr = 2001;
    String s = p.förnamn + ", född år "+ p.föddÅr +", är ";
    if (!p.singel)
      s = s + " inte "; 
    s = s + " singel";
    System.out.println(s);
  }
}

class Person {
  String förnamn;
  String efternamn;
  int föddÅr;
  boolean singel = true;
}
