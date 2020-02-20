/*
Desenvolva um sistema de login e senha. Solicitando ao usuário o seu login e armazene a
informação em uma variável. Posteriormente a sua senha e coloque-a em outra variável. Por
fim, verifique se o login e a senha são iguais àquele definido por você.
*/

/*
Grupo de programadores : Ana , Flavio e Matheus
*/


import java.util.Scanner; // Biblioteca scanner
    public class questao02{
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            //Login
            System.out.println("Login: ");
            String login = sc.nextLine();
            //Senha
            System.out.println("Senha: ");
            String senha = sc.nextLine();
            System.out.println(""); // saltar linha
               // Autenticação do usuario e senha por string 
            if(login.equals("arata") && senha.equals("123-9658") ){
                System.out.printf("Usuario %s efetuo login", login);
            }else{
                System.out.println("Login ou senha invalida");
            }
        }
    }
