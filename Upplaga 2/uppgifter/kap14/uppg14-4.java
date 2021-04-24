// Rekommenderat filnamn: Klockslag.java

class Klockslag {
  int tim;
  int min;

  void öka() {
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
  void ökaVersion2() {
    min++;
    tim = (tim + min / 60) % 24;
    min = min % 60;
  }
}
