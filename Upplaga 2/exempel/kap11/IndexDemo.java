class IndexDemo {
  public static void main(String[] arg) {
    var a = new int[5]; // skapa arrayen
    a[0] = 5;             // �ndra den f�rsta komponenten
    a[a.length-1] = 19;   // �ndra den sista komponenten
    // Skriv ut arrayen
    for (int i=0; i<a.length; i++)
      System.out.println(a[i]);
  }
}