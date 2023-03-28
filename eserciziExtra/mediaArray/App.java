import java.util.Scanner;

class App{
    public static void main(String[] args){
        System.out.println("Inserisci una lunghezza: ");
        Scanner scanner = new Scanner(System.in);
        int lunghezzaArr = scanner.nextInt();
        int[] array = new int[lunghezzaArr];

        int somma = 0;
        for (int i = 0; i < lunghezzaArr; i++) {
            System.out.println("Inserisci il " + (i+1) + " numero: " );
            array[i]= scanner.nextInt();
            somma += array[i];
        }

        int media = (int) somma / lunghezzaArr;
        System.out.println("La media dei numeor dell'array è: " + media);
    }

}

