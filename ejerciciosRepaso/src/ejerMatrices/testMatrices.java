package ejerMatrices;

public class testMatrices {
    public static void main(String[] args) {

        int matriz[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        Matrices prueba1 = new Matrices(matriz);

        System.out.println("La suma de la diagonal es: " + prueba1.sumaDiagonal());

    }
}
