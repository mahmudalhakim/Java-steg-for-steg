import javax.swing.*;
var s = JOptionPane.showInputDialog("F�rsta sidan?");
var a = Double.parseDouble(s);
s = JOptionPane.showInputDialog("Andra sidan?");
var b = Double.parseDouble(s);
var c = Math.sqrt(a*a + b*b);
JOptionPane.showMessageDialog(null,"Hypotenusans l�ngd: " + c);