import java.util.Scanner;

public class App{
    public static void main(String[] args){
        System.out.println("Inserisci un numero: ");
        Scanner scanner = new Scanner(System.in);
        int lunghezzaArr = scanner.nextInt();
        int[] array = new int[lunghezzaArr];

        int sum = 0;
        for (int i = 0; i < lunghezzaArr; i++) {
            System.out.println("Inserisci il " + (i+1) + " numero");
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println("Gli elementi con indice pari sono: ");
        for (int i = 0; i < lunghezzaArr; i+=2) {
            System.out.println(array[i] + " ");
        }
    }
}