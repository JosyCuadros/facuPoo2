package ejer1;

public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public boolean esPrimo() {
        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                contador++;
            }
        }

        if (contador <= 2) {
            System.out.println("El numero " + numero + " es primo");
            return true;

        } else {
            System.out.println("El numero " + numero + " no es primo");
            return false;
        }
    }
}
