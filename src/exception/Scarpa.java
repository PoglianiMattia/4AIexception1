package exception;

import java.util.*;

public class Scarpa {
    private int numero;
    private static Scanner tastiera;

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        System.out.println("inserire nuovo numero di Scarpa");

            this.numero = tastiera.nextInt();
    }

    public Scarpa(int numero) {
        this.numero = numero;
        tastiera = new Scanner(System.in);
        throw new NullPointerException();
    }
}
