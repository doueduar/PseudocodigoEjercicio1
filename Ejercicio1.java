import java.util.Scanner;

/**
 * Ejercicio1
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,impares,pares;
        impares = 0; pares = 0;
        System.out.println("ingrese un numero entero");
        N = scanner.nextInt();
        if (0<N) {
            for (int i = 0; i < N; i++) {
                int ale = (int)(Math.random()*100+1);
                int par = ale % 2;
                if (par==0) {
                    pares += 1;
                }else{
                    impares+=1;
                }
            }
        } else {
            System.out.println("No es valido");
        }
        System.out.println("la cantidad de pares son: "+pares+" impares son: "+impares);    
    
    }
}