// Rekommenderat filnamn:  Tarning.java
     class Tarning {
       private int värde;
    
       Tarning() {
         kasta();
       }
    
       Tarning(int v) {
         sättVärde(v);
       } 
    
       int  avläsVärde() {
         return värde;
       }
    
       void sättVärde(int v) {
         if (v >= 1 && v <= 6)
           värde = v;
         else 
           throw new IllegalArgumentException("Värdet måste ligga mellan 1 och 6");
       }
    
       void kasta() {
         värde = (int) (Math.random() * 6) + 1;
       }
    }
  