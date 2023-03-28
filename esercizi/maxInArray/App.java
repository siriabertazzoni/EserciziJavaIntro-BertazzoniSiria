import java.util.Scanner;

class App{
    public static void main(String[] args){
        System.out.println("Inserisci un numero: ");
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Inserisci un numero");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        int position = 0;
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest){
                largest = numbers[i];
                position = i;
            }
        }
        System.out.println("Il valore maggiore all'interno dell'array è " + largest + " in posizione " + position);
    }

}