import java.util.Scanner;

public class questao1 {

   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("digite o nome do aluno: ");
       String nome = scanner.nextLine();

       System.out.print("digite a primeira nota: ");
       float nota1 = scanner.nextFloat();

       System.out.print("digite a segunda nota: ");
       float nota2 = scanner.nextFloat();

       System.out.print("digite a terceira nota: ");
       float nota3 = scanner.nextFloat();

       float mediaPonderada = (nota1+nota2+(nota3 * 2)) / 4 ;
       String mensagem = String.format("media ponderada de %s: %.2f", nome, mediaPonderada);
       System.out.println(mensagem);
       if(mediaPonderada >= 7){
           System.out.println("Aprovado");
       }else{
           System.out.println("Reprovado");
       }

       scanner.close();

   }

}
