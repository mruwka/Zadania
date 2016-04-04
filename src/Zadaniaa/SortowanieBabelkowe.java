package Zadaniaa;


import java.util.ArrayList;
import java.util.Scanner;

public class SortowanieBabelkowe implements Zadanie {

    public void startTask() {
        boubble();
    }

    private void theResults(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private void boubble() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer toSort;
        int quantity;

        System.out.println("Ile cyfr chcesz podac?");
        Scanner scan = new Scanner(System.in);
        quantity = scan.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Podaj cyfre do posortowania: ");
            Scanner scan1 = new Scanner(System.in);
            toSort = scan.nextInt();
            list.add(toSort);
            System.out.println(toSort);
        }
        System.out.println("Podane cyfry to: ");

        theResults(list);
        for (int k = 0; k < quantity; k++) {
            for (int i = 0; i < quantity - 1; i++) {
                int firstTable = list.get(i);
                int secondTable = list.get(i + 1);
                int temp;
                if (firstTable > secondTable) {
                    temp = firstTable;
                    firstTable = secondTable;
                    secondTable = temp;
                    // System.out.print(temp);
                    //i++;
                }
                list.set(i, firstTable);
                list.set(i + 1, secondTable);
            }
        }
        System.out.println("\nPosortwane cyfry to:");
        theResults(list);


    }

}


