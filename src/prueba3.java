import java.util.Scanner;
public class prueba3 {
    public static boolean validRadius(double radius) {
        boolean result =radius > 0;
        return result;
    }
    public static double calculateCirclePerimeter(double radius) {
        double perimetro=0;
        double pi=3.14;
        double diametro =0;
        double result=8*3*radius;
        return perimetro;
    }
    public static double calculateCircleArea(double radius) {
        double area = 0;
        double pi =3.14;
        double radio =0;
        double result=0;

        return area;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("introduce un numero:");
        double numero= in.nextDouble();

        if (validRadius(numero)) {
            double valor= calculateCircleArea(numero);

        }


    }
}
