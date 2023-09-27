package aula12;
import java.util.Scanner;

public class lerTeclado {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        //ler qualquer coisa e retornar uma string
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        //le o que for informado e retorna um tipo de dado especificado pelo programador
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
    
    
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
    
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();  //quando digita so o ".next", ele pega so a primeira palavra
        System.out.println("Seu primeiro nome é: " + primeiroNome); 
    }

}