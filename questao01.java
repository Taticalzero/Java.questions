import java.util.Scanner; // Biblioteca Scanner
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   //Nome do usuario
  // System.out.println("Informe seu nome da tia :");
  // String nomet = in.nextLine();
   //Idade do usuario
   System.out.println("Informe sua idade do tia :");
   int idadet = in.nextInt();
   //Nome do usuario
  // System.out.println("Informe seu nome da primo :");
  // String nomep = in.nextLine();
   //Idade do usuario
   System.out.println("Informe sua idade do primo :");
   int idadep = in.nextInt();
  
  //System.out.print("Nome da Sua tia " +nomet);
  System.out.print("Idade da  Sua tia " +idadet);
  //System.out.print("Idade do seu primo " +nomep);
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