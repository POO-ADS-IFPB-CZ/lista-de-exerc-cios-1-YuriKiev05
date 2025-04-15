import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = scanner.nextInt();

        String mutliplo =  (num % 3 == 0 && num % 5 == 0) ? "ambos" :
                            (num % 3 == 0) ? "3":
                            (num % 5 == 0 )? "5": "nenhum";

        switch (mutliplo){
            case "ambos" -> System.out.println("multiplo de ambos");
            case "3" -> System.out.println("multiplo de 3");
            case "5" -> System.out.println("multiplo de 5");
            default -> System.out.println("nao e multiplo de 3 nem 5");
        }

    }


}
