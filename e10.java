/*
NOME :FABRICIO CANDIDO FERREIRA
NOME DO PROJETO [FINAL COPA DO MUNDO]
DATA: 04/12/2025

*/
//Objetivo: Fingir que o usuario estaá em uma final de copa do mundo, o usuario é batedor e goleiro, e tem como colocar o nome do individuo

import java.io.IOException;
import java.util.Scanner;

public class e10 {
    //Sub Rotina: É usada para que o codigo funcione
    public static void main(String[] args) {
        //Entrada de dados: input obter dados so usuario
        Scanner input = new Scanner(System.in);
        System.out.print("DIGITE SEU NOME: ");
        //Variavel: messi foi usada para armazenar o nome do individuo
        String messi = input.nextLine();
        //Saida de dados: print usado para mostar uma msg na tela 
        System.out.print("Jogo do Penalti ");
        System.out.println("Instruções: 1=DIREITA, 2=ESQUERDA, 3=MEIO");
        //Operador: + foi usado para adicionar o nome a frase 
        System.out.println("VAI PARA BOLA " + messi);

        int BATEDOR = input.nextInt(); 
        //Estrutura de repetição: Foi usda para que quando o usuario erre ele pode tentar de novo(até acertar )
        while (BATEDOR != 1){       
            System.out.println("PERDEUUUUUU!!");
            BATEDOR = input.nextInt();  
        }

        System.out.println("GOLLLLL!");

        System.out.println("Agora você vai defender, está pronto!");
        System.out.print("SERÁ BRASIL: ");
        
        int defesa = input.nextInt(); 
        //Estrutura de Condição; Esta parte do codigo pois só vai deixar passar se o numero for colocado corretamente
        while (defesa != 3){       
            System.out.println("GOL DOS CARA");
            defesa = input.nextInt();  
        }

        System.out.println("DEFESAÇAAAAA!");

        System.out.println("PENALTI FINAL");
        System.out.println("SERÁ  HEXA BRASIL");
        System.out.print("BATIDA FINAL VAI PARA BOLA " + messi  );
        
        int legal = input.nextInt(); 
        while (legal != 1){       
            System.out.println("DEFENDEUUUUUU");
            legal = input.nextInt();  
        }

        System.out.println("É HEXA BRASILLLLLLLL!!!!");
    }
}
