package ejer3;

public class Enteros {
    private int enteros[];

    public Enteros(int[] enteros) {
        this.enteros = enteros;
    }


    public boolean estaOrdenado() {
        boolean ordenado = false;

        for (int i=0; i  < enteros.length; i++) {
            if ((i+1) < enteros.length) {
                if (enteros[i] > enteros[i+1] ) {
                    ordenado = true;
                }else {
                    ordenado = false;
                }
            }
        }

        return ordenado;
    }
}
