import java.util.Scanner;

class Password{
    public static void main(String[] args) {
        //! almeno un carattere maiuscolo
        //! almeno un carattere speciale 

        Boolean firstRule = false;
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una password");
        String password = scanner.nextLine();
        System.out.println("La password inserita è " + password);

        //! almeno 8 caratteri
        if(password.length() >= 8) firstRule = true;

        if(firstRule && Rules(password)){
            System.out.println("La pwd è corretta");
        } else {
            System.out.println("La password non è corretta");
        }
            
    }

    public static boolean Rules(String password){
        Boolean secondRule = false;
        Boolean thirdRule = false;
        Boolean fourthRule = false;

        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))) secondRule = true;
            if(Character.isDigit(password.charAt(i))) thirdRule = true;
            char c = password.charAt(i);
            if (c == '!' || c == '£' || c == '$' || c == '%' || c == '&') {
                fourthRule = true;
            }
        }

        return secondRule && thirdRule && fourthRule;
    }

    
    
}