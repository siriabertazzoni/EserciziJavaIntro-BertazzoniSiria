import java.util.Scanner;

class App{
    public static void main(String[] args){
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int number = Integer.parseInt(scanner.nextLine());

        while(number != 0){
            int digit = number % 10;
            num = num + digit;
            number = number / 10;
        }
        System.out.println("La somma è " + num);
    }
}