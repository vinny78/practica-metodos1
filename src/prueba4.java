import java.util.Scanner;
public class prueba4 {

    public static double euro2Dollar(double euros) {
        double dollar = euros * 1.10;
        return dollar;
    }

    public static double dollar2euro(double dollar) {
        double euro = dollar * 0.91;
        return euro;

    }
    //hasta aqui el metodo
    public static void showMenu() {
        System.out.println("Escribe 1 para dolares");
        System.out.println("Escribe 2 para euros");
    }
    //hasta aqui el metodo
    //------------------------------------------------------

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        showMenu();

        int conversion = in.nextInt();


        switch (conversion){
            case 1:
                System.out.println( " elegiste la conversion de dolares a euros");
                System.out.println("introduce una cantidad de dinero");
                double cantidadD = in.nextDouble();
                double resultadoEuros = dollar2euro(cantidadD);
                System.out.println("esta es la cantidad que recibirás  " + resultadoEuros);

                break;
            case 2:
                System.out.println( " elegiste la conversion de euros a dolares");
                System.out.println( " introduce cantidad de dinero");
                double cantidadE = in.nextDouble();
                double resultadoDolares = euro2Dollar(cantidadE);
                System.out.println("esta es la cantidad que recibirás  " + resultadoDolares + " euros ");
                break;
            default:
                System.out.println("opcion no valida");
        }


    }

}


