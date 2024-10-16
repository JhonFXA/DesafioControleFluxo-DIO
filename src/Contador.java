/**
 * @author Jonathan Henrique
 * @since 16/10/2024
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int primeiroParam = 0;
        int segundoParam = 0;
        
        try{
            System.out.println("Digite o primeiro parametro:");
            primeiroParam = scanner.nextInt();

            System.out.println("Digite o segundo parametro:");
            segundoParam = scanner.nextInt();
        } catch (InputMismatchException e){
            System.err.println("ERRO: Voce deve digitar numeros inteiros!");
            scanner.close();
            return;
        }

        scanner.close();
     
        try{
            contar(primeiroParam, segundoParam);
        } catch (ParametrosInvalidosException e){
            System.err.println("ERRO: " + e.getMessage());
            return;
        }
    }

    static void contar(int primeiroParam, int segundoParam) throws ParametrosInvalidosException{
        if(primeiroParam > segundoParam){
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoParam - primeiroParam;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
