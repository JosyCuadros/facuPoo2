package ejer3;

public class testEstaOrdenado {
    public static void main(String[] args) {
        int[] vec1 = {6,5,4,3};
        Enteros prueba1 = new Enteros(vec1);

        System.out.println(prueba1.estaOrdenado());


        int[] vec2 = {6,8,4,2};
        Enteros prueba2 = new Enteros(vec1);

        System.out.println(prueba2.estaOrdenado());
    }
}
