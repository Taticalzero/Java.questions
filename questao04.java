import java.util.Scanner;

public class questao04{

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        //Definindo o limite da entrada dos valores
        System.out.println("informe o inicio da contagem: ");
        int ini = in.nextIn();
        //Definindo o limite da saida dos valores
        System.out.println("informe o final da contagem: " );
        int fim = in.nextIn();

        int i = ini; // iniciando com 1
        int soma = ini;// iniciando o intervalo com 1
        //Iniciando o loop
        while(i<fim){
            i++; //incrementando os valores
            soma+=i;
        }
        System.out.println(soma);
    }
}