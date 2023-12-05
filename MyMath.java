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

    public static boolean esPrimo(int num2) {
        if (num2 <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num2); i++) {
            if (num2 % i == 0) {
                return false;

            }
        }
        return true;

    }
public static int contarDigitosPares(int num) {
        int contador = 0;

        // Se recorre cada dígito del número
        while (num != 0) {
            int digito = num % 10; // Se obtiene el último dígito
            if (digito % 2 == 0) {
                contador++; // Se incrementa el contador si el dígito es par
            }
            num /= 10; // Se elimina el último dígito para continuar con el siguiente
        }

        return contador;
    }
    public static boolean noEsPrimo(int num3) {
        if (num3 <= 1) {
            return false; // 0 y 1 no son primos
        }

        for (int i = 2; i <= Math.sqrt(num3); i++) {
            if (num3 % i == 0) {
                return false; // Si tiene un divisor diferente de 1 y sí mismo, no es primo
            }
        }

        return true; // Si no tiene divisores diferentes de 1 y sí mismo, es primo
    }

    public static int contarNumerosPares(int num) {
        int contador = 0;

        // Se recorre cada dígito del número
        while (num != 0) {
            int digito = num % 10; // Se obtiene el último dígito
            if (digito % 2 == 0) {
                contador++; // Se incrementa el contador si el dígito es par
            }
            num /= 10; // Se elimina el último dígito para continuar con el siguiente
        }

        return contador;
    }

    public static int contardorDigitosimPares(int num) {
        int contador = 0;

        // Se recorre cada dígito del número
        while (num != 0) {
            int digito = num % 10; // Se obtiene el último dígito
            if (digito % 2 != 0) {
                contador++; // Se incrementa el contador si el dígito es impar
            }
            num /= 10; // Se elimina el último dígito para continuar con el siguiente
        }

        return contador;
    }

    public static int calcularFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }

        // El factorial de 0 es 1 por definición
        if (num == 0) {
            return 1;
        }

        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i; // Multiplicar el resultado por cada número desde 1 hasta el número dado
        }

        return resultado;


    }

    public static long calcularFactorialRecursivo(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }

        // Caso base: el factorial de 0 es 1 por definición
        if (num == 0) {
            return 1;
        }

        // Caso recursivo: n! = n * (n-1)!
        return num * calcularFactorialRecursivo(num - 1);
    }

   public static int calcularNumeroSoluciones(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            return 2; // Dos soluciones reales distintas
        } else if (discriminante == 0) {
            return 1; // Una solución real (raíz doble)
        } else {
            return 0; // No hay soluciones reales
        }
    }


    public static int sumarDigitos(int num) {
        int suma = 0;

        // Se recorre cada dígito del número
        while (num != 0) {
            int digito = num % 10; // Se obtiene el último dígito
            suma += digito; // Se suma el dígito al resultado
            num /= 10; // Se elimina el último dígito para continuar con el siguiente
        }

        return suma;
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();

        }

    }


