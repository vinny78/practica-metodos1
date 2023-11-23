import java.util.Scanner;

public class prueba5 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduce un numero del 1 al 10 para saber su tabla de multiplicar");
        showMenu();
        int tabla = in.nextInt();
        multiplicacion(tabla);


    }


    public static void multiplicacion(int num1) {
        System.out.println("el numero introducido es :" + num1);

        for (int i = 1; i < 11; i++) {

            System.out.println(i+"x" + num1 +"= " + i*num1);
        }


    }

    public static void showMenu() {
        System.out.println("introduce un numero del 1 al 10 ");


    }

}