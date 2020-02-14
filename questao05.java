/*
João deseja fazer um sistema que que solicite para a pessoa digitar um número qualquer,
posteriormente, realize a soma de todos os algarismos deste mesmo número
*/

/*
Grupo de programadores : Ana , Flavio e Matheus
*/

import  java.util.Scanner; // Biblioteca Scanner

public class questao05{

    public static void main(String[] arg){
        System.out.println("Informe um numero: "); //Solicitando numero ao usuario
        int num = new Scanner(System.in).nextInt();
        int soma = 0; // Varialvel responsavel para somar os algarismos separados . EX 12 = 1 + 2 = 3

        while(num>0){
            // Obtenhe-se o modulo do numero antes de se realizar a soma
             int modulo = num % 10;
             // incrementa-se o modulo 
             soma += modulo;
             // divide-se por fim por 10 para chegar no novo valor
             num/=10;
             // procedimento sendo printado passo a passo na mudança 
             System.out.println("Valor de soma é  ", +soma);
        }
        System.out.println(); // salto de linha
        System.out.println("Valor total de todos os numeros digitados é ", +soma);//soma final


    }
}
