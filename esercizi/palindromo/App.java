import java.util.Scanner;

class App{
    public static void main(String[] args){

        String x = "";
        String y = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una parola: ");
    
        x = sc.nextLine();
        int len = x.length();
    
        for(int i = len -1; i >= 0; i--){
            y = y + x.charAt(i);
        }
    
        if(x.equalsIgnoreCase(y)){
            System.out.println("La stringa è palindroma");
        } else {
            System.out.println("La stringa non è palindroma");
        }
    }


}