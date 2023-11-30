import java.util.Scanner;
public class MyMath {
    public static double squarePerimeter(double perimetro) {
        double valorLado = 0;
        double PerimetroCuadrado = valorLado * 4;
        return perimetro;
    }

    public static double squareArea(double area) {
        double valorLado = 0;
        double PerimetroCuadrado = valorLado * valorLado;
        return area;
    }

    public static double rectanglePerimeter(double perimetro) {
        double valorLado = 0;
        double valorAltura = 0;
        double PerimetroRectangulo = valorLado + valorAltura * 2;
        return perimetro;
    }

    public static double rectangleArea(double area) {
        double valorLargo = 0;
        double valorAncho = 0;
        double Perimetrorectangulo = valorLargo * valorAncho;
        return area;
    }

    public static double circlePerimeter(double perimetro) {
        double valorPI = 3.14;
        double valorDiametro = 0;
        double PerimetroCirculo = valorPI * valorDiametro;
        return perimetro;
    }

    public static double circleArea(double area) {
        double valorPI = 3.14;
        double valorRadio = 0;
        double areaCirculo = valorPI * Math.pow(valorRadio, 2);
        return area;
    }

    public static int digitos(int numero) {
        System.out.println(" Introduce un numero ");
        int contador = 0;


        if (numero == 0) {
            return 1;
        }
        while (numero != 0) {
            numero = numero / 10;
            contador++;

        }
        System.out.println("esta es la cantidad de digitos :");
        return contador;

    }

    public static int digitosPares(int numero) {
        System.out.println(" Introduce un numero ");
        int contador = 0;


        if (numero == 0) {
            return 0;
        }
        while (numero != 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                contador++;
            }

            numero = numero / 10;

        }
        System.out.println("esta es la cantidad de digitos pares:");
        return contador;

    }


    public static int digitosImpares(int numero) {
        System.out.println(" Introduce un numero ");
        int contador = 0;


        if (numero == 0) {
            return 0;
        }
        while (numero != 0) {
            int digito = numero % 10;
            if (digito % 2 == 1) {
                contador++;
            }

            numero = numero / 10;

        }
        System.out.println("esta es la cantidad de digitos impares:");
        return contador;

    }

    public static int factorial(int numero) {
        int num = 0;
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return -1; // Valor indicativo de error
        }

        int resultado = 1;

        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static int factorialRecursivo(int numero) {
        int num = 0;

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return -1; // Valor indicativo de error
        }
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * factorialRecursivo(numero - 1);
        }
    }

    public static int ecuacionSegundoG(int a,int b,int c){

        int soluciones = ecuacionSegundoG(a, b, c);
        System.out.println("La ecuación tiene " + soluciones + " soluciones.");

        int discriminante=b*b-4*a*c;
        if (discriminante > 0) {
            return 2;
        }  else if (discriminante==0){
            return 1;
        } else{
            return 0;
        }
    }

    public static int sumaDigitos(int numero){
        numero=Math.abs(numero);
    int suma=0;
    while (numero>0){
        suma+=numero%10;
        numero/=10;
    }
    return suma;
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
    }
}
