/*
Desenvolva um sistema que realize o somatório dos números de 1 até 100
*/

/*
Grupo de programadores : Ana , Flavio e Matheus
*/

public class questao03{

    public static void main(String[]args) {
        //Contador
        int soma = 0;
        // Inicio do Loop
        System.out.print("A soma dos seus 100 primeiros números é:  ");
         for(int i = 1; i<=100; i++){
             soma += i; // Incremento do Loop
         }
         System.out.println(soma); // Saida com o resultado final 
    }
}
