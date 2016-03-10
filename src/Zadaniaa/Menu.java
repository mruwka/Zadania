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

            System.out.println("Tu beda wyswietlone zadania");
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj numer zadania ");
            selectedCase = scan.nextInt();

            switch (selectedCase) {
                case 1:
                    UkladRownan ur = new UkladRownan();
                    ur.rozwiazRownanie();
                    break;
                case 2:
                    LiczbaArmstronga la = new LiczbaArmstronga();
                    la.wyliczLiczbe();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
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
