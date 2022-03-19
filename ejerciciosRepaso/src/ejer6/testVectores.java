package ejer6;

public class testVectores {
    public static void main(String[] args) {

        int vec1[] = {-5, 0, 0, 1, 5};
        int vec2[] = {-10, 0, 7};

        Vector vectorPrueba1 = new Vector(vec1);
        Vector vectorPrueba2 = new Vector(vec2);

        Vector vectorResultado = vectorPrueba1.mezclarOrdenarVector(vectorPrueba2);

        System.out.println(vectorResultado);

    }
}
