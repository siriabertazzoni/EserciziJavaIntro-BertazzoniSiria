import java.util.Scanner;

class Reverse{
    public static void main(String[] args){
        int rev = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero");
        int number = scanner.nextInt();

        while(number != 0){
            int digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;
        }

        System.out.println("Il numero inserito è " + rev);
    }
}