package Zadaniaa;

import java.util.Scanner;

public class Palindrom {

    public void getRange() {
        System.out.println("Podaj przedzial Palindrom - od 0 do 196");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        System.out.println("Podales zakres: " + r);
        if (r < 197) {
            countePalindrom(r,0);
        }

                  else{
            System.out.println("Podales za duzy przedzial!");
        }

     }


    private void countePalindrom(long r, long j) {
        for (long i = j; i < r; i++) {

            long reveredI = reversNumber(i);

            if (i == reveredI) {
                System.out.println(i + " jest Palindrom");
            } else {
                long newI = i + reveredI;
                System.out.println(i + " jest Palindrom. Sprawdzam dla " + newI);
                countePalindrom(newI + 1, newI);
            }


        }
    }



    private long reversNumber(long number) {

        long reversedNumber = 0;
        while (number !=0)
        {
            reversedNumber =  reversedNumber * 10 + number % 10;
            number = number / 10;

        }
        return reversedNumber;

    }


}
