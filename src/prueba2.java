import java.util.Scanner;

public class prueba2 {
    public static int numberSign(int number) {
        int result = 0;
        if (number>0) {
            result=1;

        } else if (number<0) {
            result=-1;
        }
        else {
            result=0;
        }
        return result;
    }
    public static boolean isAdult(int age){
        boolean edad = true;

        if (age>=18){
            edad=true;
        } else {
            edad=false;
        }
        return edad;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero:");
        int valor = scanner.nextInt();
        int signo = numberSign(valor);
        if (signo==1){
            System.out.println("es positivo");
        } else if (signo==-1) {
            System.out.println("es negativo");

        }else if(signo==0){
            System.out.println("el numero es 0");
        }

        System.out.println("introduce tu edad:");
        int edad = scanner.nextInt();
        boolean anios = isAdult(edad);
        if (edad >= 18) {
            System.out.println("es mayor de edad");
        }else {
            System.out.println("es menor de edad");
        }




    }
}
