/*
João deseja fazer um sistema que que solicite para a pessoa digitar um número qualquer,
posteriormente, realize a soma de todos os algarismos deste mesmo número
*/

/*
Grupo de programadores : Ana , Flavio e Matheus
*/

import java.util.Scanner; // Importando a biblioteca Scanner

public class questao05{
    static Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] arg){
        System.out.println("Informe um numero: ");
        int num = sc.nextInt(); // Variavel dos numeros
        int soma = 0;

        while(num>0){
            // Obtenhe-se o modulo do numero antes de se realizar a soma
             int modulo = num % 10;
             // incrementa-se o modulo 
             soma += modulo;
             // divide-se por fim por 10 para chegar no novo valor
             num/=10;
             // procedimento sendo printado passo a passo
             System.out.println("Valor de soma é  " + soma);
        }
        System.out.println(); // salto de linha
        System.out.println("Valor total de todos os numeros digitados é " + soma); //soma final


    }
}
