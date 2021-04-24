// Filen Tips.java

class Tips { 

  public static void main(String[] arg) {
    for (int i=1; i<=13; i++) {
      int k = (int) (Math.random() * 3);
      char c;
      if (k==0)
        c = '1';
      else if (k==1)
        c = 'X';
      else
        c = '2';
      System.out.println(c);
    }
  }
}


