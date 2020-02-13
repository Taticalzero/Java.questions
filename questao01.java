/*
Desenvolva um sistema que peça a idade do seu primo e a idade da sua tia. Em seguida,
imprima as informações a seguir: 
- a do seu primo
- a idade da sua tia
- minha tia tem <anos> a mais do que eu
*/

import java.util.Scanner; // Biblioteca Scanner
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   //Idade do usuario
   System.out.println("Informe sua idade do tia :");
   int idadet = in.nextInt();
   //Idade do usuario
   System.out.println("Informe sua idade do primo :");
   int idadep = in.nextInt();
    //Saida do idade da tia
  System.out.print("Idade da  Sua tia " +idadet);
  // Saida da idade do primo
  System.out.println("   Idade do seu primo " +idadep);
//Operação logica
    int x;
    int y;
// comparativo de idades 
    if(idadep > idadet){
      y = idadep-idadet;
       System.out.println("A diferença da idade entre a primo e  sua tia é :" +y);
    }else{
      x = idadet-idadep ;
       System.out.println("A diferença da idade entre a tia e  seu primo é :" +x);
    }
  }
}
