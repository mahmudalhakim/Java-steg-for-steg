// Rekommenderat filnamn:  Tarning.java
     class Tarning {
       private int v�rde;
    
       Tarning() {
         kasta();
       }
    
       Tarning(int v) {
         s�ttV�rde(v);
       } 
    
       int  avl�sV�rde() {
         return v�rde;
       }
    
       void s�ttV�rde(int v) {
         if (v >= 1 && v <= 6)
           v�rde = v;
         else 
           throw new IllegalArgumentException("V�rdet m�ste ligga mellan 1 och 6");
       }
    
       void kasta() {
         v�rde = (int) (Math.random() * 6) + 1;
       }
    }
  