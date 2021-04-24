// Filen Ljud.java

import javax.swing.*;
import java.net.*;
import java.applet.*;

public class Ljud {
  public static void main (String[] arg) throws MalformedURLException, InterruptedException {
    String filnamn = JOptionPane.showInputDialog("Ljudfil?");
    URL u = new URL(filnamn);
    AudioClip a = Applet.newAudioClip(u);
    a.loop();
    Thread.sleep(30000);
  }
}
