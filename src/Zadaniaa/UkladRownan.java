package Zadaniaa;
import java.util.*;


public class UkladRownan
{
    private float wyznacznik, wyznaczinkx, wyznaczniky;
    private float liczWyznacznik(int w1, int w2, int w3, int w4)
    {
        return (w1*w2-w3*w4);
    }

    public void rozwiazRownanie()
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj A: ");
        int a = scan.nextInt();
        System.out.println("Podaj B: ");
        int b = scan.nextInt();
        System.out.println("Podaj C: ");
        int c = scan.nextInt();
        System.out.println("Podaj D: ");
        int d = scan.nextInt();
        System.out.println("Podaj E: ");
        int e = scan.nextInt();
        System.out.println("Podaj F: ");
        int f = scan.nextInt();
        System.out.println("Podales uklad rownan: "+a+"x"+b+"y"+c+"\n"+d+"x"+e+"y"+f);

        float wyznacznik = this.wyznacznik;
        wyznacznik = liczWyznacznik(a,e,b,d);
        System.out.println("Wyznacznik jest równy: " + wyznacznik);

        float wyznacznikx = this.wyznaczinkx;
        wyznacznikx = liczWyznacznik(c,e,b,f);
        System.out.println("Wyznacznik X to: " + wyznacznikx);

        float wyznaczniky = this.wyznaczniky;
        wyznaczniky = liczWyznacznik(a,f,c,d);
        System.out.println("Wyznacznik Y to: " + wyznaczniky);

        if(wyznacznik !=0) {
            System.out.println("Uklad jest oznaczony");
            float rozwiazaniex = wyznacznikx / wyznacznik;
            float rozwiazaniey = wyznaczniky / wyznacznik;
            System.out.println("Rozwiazanie: x jest równe: " + rozwiazaniex + " a Y jest rowny :" + rozwiazaniey);
        }
        else if (wyznacznik==0 && (wyznacznikx!=0 || wyznaczniky!=0))
        {
            System.out.println("Ukald jest sprzeczny!");
        }
        else
        {
            System.out.println("Uklad jest nieoznaczony!");
        }
    }

}
