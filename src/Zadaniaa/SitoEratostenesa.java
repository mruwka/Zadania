package Zadaniaa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by PL036604 on 15/03/2016.
 */
public class SitoEratostenesa implements Zadanie{

    public void startTask() {


        System.out.println("Podaj przedzial Sita: ");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        System.out.println("Podales zakres Sita rowny " + r);
        ArrayList<Integer> l = creatList(r);
        counteFilter(l);



    }


    private void counteFilter(ArrayList l){
        ArrayList<Integer> tempList;
        tempList = l;
        for(int i=2; i< tempList.size() + 2; i++){
            for (int j=0; j<tempList.size(); j++){
                if(tempList.get(j) % i ==0 && tempList.get(j)>i) {
                    tempList.remove(j);
                }
            }

        }

        for (int j = 0; j<tempList.size(); j++){

            System.out.println("["+tempList.get(j)+"]");
        }

    }


    private ArrayList<Integer> creatList(int r){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<r; i++){
            list.add(i);


        }
        for (int j=0; j<list.size(); j++){
          //  System.out.println(list.get(j));


        }
        return list;
    }

}
