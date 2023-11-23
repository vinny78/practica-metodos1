import java.util.Scanner;
public class prueba8 {

    public static boolean fecha(int year, int month, int day) {
        boolean esCorrecta = false;
        int month1 = 1;
        int day1 = 1;
        if (month >= 1 && month <= 12) {

            esCorrecta = true;
            if (month == 4 || month == 6 || month == 9 || month == 11 && day <= 30) {


                esCorrecta = true;
            } else if (month == 2 && day <= 29) {


                esCorrecta = true;
            } else {
                return esCorrecta;
            }
        }

        return esCorrecta;
        /// if miraros month 1-12 day 1 y 31
        ///     if mes 4 6 9 11 30 esCorrecta = true
        ////    else if mes 2 29 esCorrecta = true
        ////    else esCorrecta = true

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("introducir fecha: dia/mes/año");
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();

        if (fecha(day, month, year)) {
            System.out.println("la fecha es correcta");

        } else {
            System.out.println("no es correcta");


        }

    }
}

