import java.util.Random;

public class bubbleSort {
    
    public static void main(String[] args){
        Random gerador = new Random();
        int numeros [] = new int[10];

        for(int i=0; i<numeros.length; ++i)
            numeros[i] = gerador.nextInt(100);

        System.out.println("-----LISTA DESORGANIZADA-----");
        //int cont = 0;
        for(int i=0; i<numeros.length; ++i){
            System.out.print(numeros[i]+" ");
        }
        
        System.out.println("");
        System.out.println("");
        
        int aux;
        int analises = 0;
        int trocas = 0;

        System.out.println("------ORGANIZANDO LISTA------");

        for(int i=0; i<numeros.length; ++i){
            for(int j=i; j<numeros.length; ++j){
                if(numeros[i] > numeros[j]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                    trocas +=1;
                }        
                else analises +=1;
            }
            int cont2 = 0;
            for(int p=0; p<numeros.length; ++p){
                System.out.print(numeros[p]+" ");
                cont2 += 1;
                
                if (cont2 == numeros.length){
                    System.out.println(" ");
                }
            }
        }
        System.out.println("");
        System.out.println("------LISTA ORGANIZADA------");

        for(int i=0; i<numeros.length; ++i)
            System.out.print(numeros[i]+" ");

        System.out.println("");
        System.out.println("");    
        System.out.println("Analises: " + analises);
        System.out.println("Trocas: " + trocas);
    
    }
}
