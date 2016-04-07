package Zadaniaa;

public class SymetrycznaTablica implements Zadanie {
    public void startTask(){

        boolean cheker = true;
        int [][] matrix =  {{1,2,3,4},
                            {2,5,10,3},
                            {3,1,6,9},
                            {4,3,9,6}};

        System.out.println("\n\n"+ matrix.length + " x " + matrix[0].length);

        for(int i=0; i<matrix.length; i++){
            System.out.println();
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j]);
                if (matrix[i][j] != matrix[j][i]){
                cheker = false;}
            }

            }
        System.out.println();
        if (cheker){
            System.out.println("\n Tablica jest symetryczna! :)");
        }
        else
        {
            System.out.println("Tablica nie jest symetryczna! :( ");
        }
        }


    }