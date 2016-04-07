package Zadaniaa;

import java.util.Scanner;

public class Menu {

    int selectedCase;

    public Menu()
    {
        this.selectedCase = selectedCase;
    }


    public void showMenu() {
        boolean repeat = true;


        do {

            System.out.println(" \n\n Zadania: \n\n 1: Układ Równań \n 2: LiczbaArmstronga \n 3: Palindrom \n 4: Sito Eratostenesa \n 5: Szyfrowanie \n 6: SortowanieBabelkowe \n" +
                    " 7: Symetryczna Tablica \n 0: Koniec \n");
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj numer zadania: ");
            selectedCase = scan.nextInt();

            switch (selectedCase) {
                case 1:
                    Zadanie ur = new UkladRownan();
                    ur.startTask();
                    break;
                case 2:
                    Zadanie la = new LiczbaArmstronga();
                    la.startTask();
                    break;
                case 3:
                    Zadanie p = new Palindrom();
                    p.startTask();
                    break;
                case 4:
                    Zadanie se = new SitoEratostenesa();
                    se.startTask();
                    break;
                case 5:
                    Zadanie sz = new Szyfrowanie();
                    sz.startTask();
                    break;
                case 6:
                    Zadanie sb = new SortowanieBabelkowe();
                    sb.startTask();
                    break;
                case 7:
                    Zadanie st = new SymetrycznaTablica();
                    st.startTask();
                    break;
                case 0:
                    repeat = false;
                    break;
                default:
                    break;
            }

            }
            while(repeat);

        }
    }
