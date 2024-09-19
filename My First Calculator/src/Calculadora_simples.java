import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner operacao = new Scanner(System.in);       
        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);
        Scanner resposta = new Scanner(System.in);
        int resposta1 = 1;

        while (resposta1 == 1)
        {
            System.out.println("Qual operação você deseja fazer? ");
            char operacao1 = operacao.next().charAt(0);

            System.out.println("Digite o primeiro número: ");
            double primeiro = numero1.nextDouble();

            System.out.println("Digite o segundo número: ");
            double segundo = numero2.nextDouble();

            if (operacao1 == '+') {
                System.out.println(primeiro + segundo);
            }

            else if (operacao1 == '-') {
                System.out.println(primeiro - segundo);
            }

            else if (operacao1 == '*') {
                System.out.println(primeiro * segundo);
            }

            else if (operacao1 == '/') {
                System.out.println(primeiro / segundo);
            }    

            System.out.println("Deseja fazer uma nova operação? Digite (1) para Sim ou (0) para Não");
            resposta1 = resposta.nextInt();

            if (resposta1 == 1) {
                System.out.println("Vamos lá!"); 
            }
            
            else {
                System.out.println("Obrigado, até a próxima!");
            }

            operacao.nextLine();
            numero1.nextLine(); 
            numero2.nextLine(); 
            resposta.nextLine();
        }

        operacao.close();
        numero1.close();
        numero2.close();
        resposta.close();
    }
}
