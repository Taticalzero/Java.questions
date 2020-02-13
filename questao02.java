import java.util.Scanner;
    public class questao02{

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //Login
            System.out.println("Login> ");
            String login = in.nextLine();
            //Senha
            System.out.println("Senha> ");
            String senha = in.nextLine();
    
            if(login.equals("arata") && senha.equals("123-9658") ){
                System.out.printf("Usuario %s efetuo login", login);
            }else{
                System.out.println("Login ou senha invalida");
            }
        }
    }
