Du kan anta att filen mobildata.txt sist på varje rad innehåller priset för att skicka ett SMS.
Det två första raderna kan t.ex. ha utseendet:
Natt        79 2,00 0,40  0  0 1,5
Maxring    199 0,99 0,99  0  0 0,6

I programmet deklarerar du ytterligare ett fält:
    double[] perSMS    = new double[100];

och i den första while-satsen lägger du till en inläsning till komponenterna fältet:
      perSMS[n] = fil.nextDouble();

Fråga användaren hur många SMS skom skickas per månad genom att lägga till raderna:
      String s2 = JOptionPane.showInputDialog
               ("Hur många SMS skickar du per månad\n"); 
      if (s2 == null)
        break;
      Scanner input2 = new Scanner(s2);
      double  antalSMS = input2.nextDouble();

För att beräkna kostnaden per månad för ett visst abonneman lägger du slutligen till SMS-kostanade.
Satsen blir då:
        double kostnad = perMån[i]+ antalDag*perMinDag[i]
                                  + antalÖvr*perMinÖvr[i]
                                  + antalSMS*perSMS[i];

