package Zadaniaa;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.AbstractList;

public class LiczbaArmstronga {

    public void wyliczLiczbe() {
        System.out.println("Liczby armstroga ");

        int n = 2000;

        int i;
        for (i = 0; i < n; i++) {
            int iSize;
            iSize = String.valueOf(i).length();
            double c = 0;
            for (int j = 0; j < iSize; j++)
            {
                String iString = String.valueOf(i);
                char iChar = iString.charAt(j);
                int iCharInt = Integer.parseInt(String.valueOf(iChar));
                double iCharPotega = Math.pow(iCharInt, iSize);
                c = c + iCharPotega;
            }
            if (c == i) System.out.println(c);
        }

    }

}
