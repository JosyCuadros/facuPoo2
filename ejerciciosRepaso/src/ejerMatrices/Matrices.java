package ejerMatrices;

public class Matrices {
    private int matriz[][];

    public Matrices(int[][] matriz) {
        this.matriz = matriz;
    }

    public int sumaDiagonal() {
        int suma = 0;

/*		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				if (x == y) {
					 suma = (matriz[x][y] + suma);
				}
			}
		} */

        for (int i=0; i < matriz.length; i++) {
            suma = (matriz[i][i] + suma);
        }

        return suma;

    }
}
