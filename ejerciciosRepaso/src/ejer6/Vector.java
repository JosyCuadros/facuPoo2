package ejer6;

import java.util.Arrays;

public class Vector {
    private int vector[];

    public Vector(int[] vector) {
        this.vector = vector;
    }

    public int calcularLongitud() {
        return vector.length;
    }

    public int leerVector(int pos) {
        return vector[pos] ;
    }


    public Vector mezclarOrdenarVector(Vector vec) {
        int cantElementos = vector.length + vec.calcularLongitud();
        int vecRes[] = new int[cantElementos];
        int pos = 0;

        for (int i=0; i < vector.length; i++) {
            vecRes[i] = vector[i];
            pos = i;
        }

        for (int j=0; j < vec.calcularLongitud(); j++) {
            pos++;
            vecRes[pos] = vec.leerVector(j);
        }

        Arrays.sort(vecRes);
        Vector resultado = new Vector(vecRes);
        return resultado;

    }

    @Override
    public String toString() {
        return "Vector{" + Arrays.toString(vector) + '}';
    }
}
