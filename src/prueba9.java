import java.util.Scanner;

public class prueba9 {
    public static void main(String[] args) {
        imprimirTriangulo('a', 4);
        Scanner in = new Scanner(System.in);
    }

    static void imprimirTriangulo(char caracter, int numLineas) {
        for (int i = 1; i <= numLineas; i++) {
            // Imprimir espacios en blanco
            for (int j = 0; j < numLineas - i; j++) {
                System.out.print(" ");
            }

            // Imprimir caracteres
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(caracter);
            }

            // Cambiar de línea después de cada fila
            System.out.println();
        }
    }
}
