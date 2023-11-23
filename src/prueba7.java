import java.util.Scanner;
public class prueba7 {
    
    public static  boolean esPrimo(int num2) {
        if (num2 <= 1) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num2) ; i++) {
            if (num2 %i ==0){
                return false;
            }
        }
        return true;

    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduce numeros mayor o igual a 0");
        int num = in.nextInt();
       if (esPrimo(num)){
           System.out.println(num + " es primo ");
       }else{
           System.out.println("no es primo");
       }

        
    }
}
