import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int numUm = terminal.nextInt();
        System.out.println("Insira o segundo número: ");
        int numDois = terminal.nextInt();

    
    try {
        contar(numUm,numDois);
    }
    catch(ParametrosInvalidosException e){
        System.out.println("Erro " + e.getMessage());
    }
    }
    
    static class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException(String mensagem){
            super(mensagem);
        }
    }


    static void contar(int param1, int param2) throws ParametrosInvalidosException{
        if (param1 > param2){
            throw new ParametrosInvalidosException("O segundo parâmetro tem que ser maior que o primeiro");
        }
        else{
            int aux = param2 - param1;
            for(int x = 1; x <= aux; x++){
                System.out.println("Imprimindo o número " + x);
            }
        }
    }

}
