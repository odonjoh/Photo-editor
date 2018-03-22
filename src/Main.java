//TestMyCode
//TMC
//Organization Lumon lukio
//Course lumo-lumo-koodi-2017
//Exercise viikko03-Viikko03_078.Fotari
//Submission #1097002
//Submission 1097002
//All tests successful
//
//Got 4 out of 4 points (78.1, 78.2, 78.3, 78.4).
//Submitted at 18:12 08.06.2017 by odonjoh.
//Took 25 seconds to process.
//Download as zip
//
//Test Results
//Files
//
//src/Main.java
 
import java.util.ArrayList;
import java.util.Scanner;
import kuva.Fotari;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner lukija = new Scanner(System.in);
        
        
        // käytössä ilta.jpg, puu.jpg, kukka.jpg ja fluffy.jpg
        System.out.print("Mikä kuva avataan? ");
        String kuva = lukija.nextLine();
 
        Fotari.avaa(kuva);
        
        System.out.println(Fotari.kuvanKorkeus());
        System.out.println(Fotari.kuvanLeveys());
        
        
        while (true) {
            System.out.print("komento (lopeta, vaalenna, tummenna, negatiivi, peilaus)? ");
            String komento = lukija.nextLine();
 
            if (komento.equals("lopeta")) {
                break;
            }
 
            if (komento.equals("vaalenna")) {
                vaalenna();
                
            } else if (komento.equals("tummenna")) {
                tummenna();
            } else if (komento.equals("negatiivi")) {
                negatiivi();
            } else if (komento.equals("peilaa")) {
                peilaa();
            } else if (komento.equals("andywarhol")) {
                andywarhol();
            }
        }
 
        Fotari.sulje();
    }
 
    public static void vaalenna() {
        int x = 0;
        while (x < Fotari.kuvanLeveys()) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                int punainen = Fotari.punainen(x, y);
                int vihrea = Fotari.vihrea(x, y);
                int sininen = Fotari.sininen(x, y);
 
                Fotari.asetaVari(x, y,
                        Math.min(255, punainen + 30),
                        Math.min(255, vihrea + 30),
                        Math.min(255, sininen + 30));
 
                y++;
            }
            x++;
        }
    }
    public static void tummenna() {
        
        int x = 0;
        while (x < Fotari.kuvanLeveys()) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                int punainen = Fotari.punainen(x, y);
                int vihrea = Fotari.vihrea(x, y);
                int sininen = Fotari.sininen(x, y);
                
                Fotari.asetaVari(x, y,
                        Math.max(0, punainen - 30),
                        Math.max(0, vihrea - 30),
                        Math.max(0, sininen - 30));
                
                
 
                y++;
            }
            x++;
        }
        
    }
    
    public static void negatiivi() {
        
        int x = 0;
        while (x < Fotari.kuvanLeveys()) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                int punainen = Fotari.punainen(x, y);
                int vihrea = Fotari.vihrea(x, y);
                int sininen = Fotari.sininen(x, y);
                
                Fotari.asetaVari(x, y,
                        Math.max(0, 255 - punainen),
                        Math.max(0, 255 - vihrea),
                        Math.max(0, 255 - sininen));
                
                
 
                y++;
            }
            x++;
        }
        
    }
    
    public static void peilaa() {
        
        int x = 0;
        while (x < Fotari.kuvanLeveys() /2) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                int aksa = Fotari.kuvanLeveys() - x -1;
                int punainen = Fotari.punainen(aksa, y);
                int vihrea = Fotari.vihrea(aksa, y);
                int sininen = Fotari.sininen(aksa, y);
                
                
                Fotari.asetaVari(x, y,
                        Math.max(0, punainen),
                        Math.max(0, vihrea),
                        Math.max(0, sininen));
                
                
 
                y++;
            }
            x++;
        }
        
    }
    
    public static void andywarhol() {
        
        int x = 0;
        while (x < Fotari.kuvanLeveys()) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                int punainen = Fotari.punainen(x, y);
                int vihrea = Fotari.vihrea(x, y);
                int sininen = Fotari.sininen(x, y);
                
                Fotari.asetaVari(x, y,
                        Math.max(0, 255 - punainen),
                        Math.max(0, 255 - vihrea),
                        Math.max(0, 255 - sininen));
                
                
 
                y++;
            }
            x++;
        }
    }
    
 
 
}
 


