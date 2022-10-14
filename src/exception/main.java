package exception;

import java.util.*;

public class main {
    public static Scanner tastiera = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            Classe c = new Classe("pogliani,scarsella,berti,pellegrini");
        } catch (ClasseTroppoGrandeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("inserire un numero intero da 1 a 10, meglio se 3");
        int a[] = {1, 23, 3};

        Scarpa scarpa = new Scarpa(43);
        System.out.println("Numero scarpa creata: " + scarpa.getNumero());
        scarpa.setNumero();
        System.out.println("nuovo numero: " + scarpa.getNumero());

        boolean cicla = true;
        int n = 0;
        while (cicla) {
            try {
                System.out.println(a[tastiera.nextInt()]);
                cicla = false;
            } catch (InputMismatchException ciaone) {
                if (ciaone.getMessage() == null) {
                    System.out.println("Inserire un nuovo valore:");
                } else {
                    System.out.println("errore:\t" + ciaone.getMessage()
                            + "\n\n Inserire un nuovo valore:");
                }
                cicla = true;
                tastiera.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                cicla = true;
            } finally {
                System.out.println("finally");
            }
        }
        //chiusura di file
        System.out.println("ciao");


        n = n >= 10 ? 10 : n;
        n = n <= 1 ? 1 : n;
        System.out.println(n);
        System.out.println(n == 3 ? "BRAVO BIMBO" : "potevi impegnarti di più");
    }
}
