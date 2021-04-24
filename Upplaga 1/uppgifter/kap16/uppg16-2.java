// Ändra i klasserna A och B så att de hamnar i paketet ABpak
// Döp om mappen de ligger i så att den också heter ABpak

// Filen A.java
package ABpak;

public class A {
  int i;
}

// Filen B.java
package ABpak;

public class B {
  A a = new A();
}


// Skapa sedan en jar-fil som innehåller klasserna A och B.
// Kopiera jar-filen till det rätta stället

// Ändra i klassen C så att den importerar paketet ABpak:

// Filen C.java
import ABpak.*;

public class C {
  public static void main(String[] arg) {
    A a = new A();
    B b = new B();
  }
}


