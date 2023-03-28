import java.util.Scanner;

public class App{
    public static void main(String[] args){
        //! PESO
        System.out.println("Inserisci il tuo peso: ");
        Scanner scanner = new Scanner(System.in);
        double peso = scanner.nextDouble();
        //! ALTEZZA
        System.out.println("Inserisci la tua altezza (esempio: 1,60): ");
        Scanner scanner1 = new Scanner(System.in);
        double altezza = scanner.nextDouble();

        //! CALCOLO BMI
        double bmi = peso / (altezza * altezza);
        System.out.println("Il tuo BMI è " + bmi);

        if(bmi < 16){
            System.out.println("Sei sottopeso");
        }else if(bmi > 16 && bmi < 25){
            System.out.println("Sei normopeso");
        }else{
            System.out.println("Sei sovrappeso");
        }
        
    }

}




