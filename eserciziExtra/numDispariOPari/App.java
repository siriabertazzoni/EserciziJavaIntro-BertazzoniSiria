import java.util.Scanner;

class App{
    public static void main(String[] args){
        System.out.println("Inserisci un numero: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Il numero " + number + " è pari");
        }else{
            System.out.println("Il " + number + " è dispari");
        }
        
    }
}