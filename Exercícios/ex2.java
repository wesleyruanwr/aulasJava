package Exercícios;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-----CALCULADORA DE SALÁRIO----");
        System.out.println("Quanto você ganha por hora? ");
        int valorHora = scan.nextInt();
        
        System.out.println("Quantas horas você trabalha por semana? ");
        int quantHora = scan.nextInt();

        int salario = (quantHora * 4) * valorHora;

        System.out.println("Seu salário mensal é: " + salario);

    }
    

}
