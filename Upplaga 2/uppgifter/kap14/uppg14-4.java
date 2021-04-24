// Rekommenderat filnamn: Klockslag.java

class Klockslag {
  int tim;
  int min;

  void �ka() {
    if (min < 59) 
      min++;
    else {
      min = 0;
      if (tim < 23)
        tim++;
      else
        tim = 0;
    }
  }

  // Smartare version 
  void �kaVersion2() {
    min++;
    tim = (tim + min / 60) % 24;
    min = min % 60;
  }
}
