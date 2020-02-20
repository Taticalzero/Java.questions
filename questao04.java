/*
Faça um sistema que realize o somatório dos números no intervalo determinado pelo usuário.
Peça para o usuário definir o início e o final da contagem
*/

/*
Grupo de programadores : Ana , Flavio e Matheus
*/

import java.util.Scanner; // Biblioteca Scanner

public class questao04{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg){
        //Definindo o limite da entrada dos valores
        System.out.println("informe o inicio da contagem: ");
        int ini = sc.nextIn();
        //Definindo o limite da saida dos valores
        System.out.println("informe o final da contagem: " );
        int fim = sc.nextIn();

        int i = ini; // iniciando os contadores
        int soma = ini;// iniciando os contadores
        
        //Iniciando o loop
        while(i<fim){
            i++; //incrementando os valores
            soma+=i; // incrementando a soma dos valores 
        }
        System.out.println(soma); // saida dos valores finais da soma 
    }
}
