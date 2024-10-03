import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // chamada para o usuário iniciar o programa
        System.out.println("Vamos calcular o seu IMC! Digite a sua altura: ");
        Scanner altura = new Scanner(System.in);
        double altura1 = altura.nextFloat();
        
        System.out.println("Agora digite o seu peso: ");
        Scanner peso = new Scanner(System.in);
        double peso1 = peso.nextFloat();
        double cal_Altura = (altura1*altura1);
        double cal_Imc = (peso1/cal_Altura);

        // definição de condições para verificação do índice de massa corporal de acordo com as entradas do usuário
        if (cal_Imc <= 16) {
            System.out.printf("Você está com Magreza Grave, o seu IMC é de %.1f", cal_Imc);
        }
        
        else if ((cal_Imc >= 16) && (cal_Imc < 16.9)) {
            System.out.printf("Você está com Magreza Moderada, o seu IMC é de %.1f !", cal_Imc);
        }

        else if ((cal_Imc >= 17) && (cal_Imc < 18.5)) {
            System.out.printf("Você está com Magreza Leve, o seu IMC é de %.1f !", cal_Imc);
        }

        else if ((cal_Imc >= 18.6) && (cal_Imc < 24.9)) {
            System.out.printf("Você está no Peso Ideal, o seu IMC é de %.1f !", cal_Imc);
        }

        else if ((cal_Imc >= 25) && (cal_Imc < 29.9)) {
            System.out.printf("Você está com Sobrepeso, o seu IMC é de %.1f !", cal_Imc);
        }

        else if ((cal_Imc >= 30) && (cal_Imc < 34.9)) {
            System.out.printf("Você está com Obesidade Grau I, o seu IMC é de %.1f !", cal_Imc);
        }

        else if ((cal_Imc >= 35) && (cal_Imc < 39.9)) {
            System.out.printf("Você está com Obesidade Grau II ou Severa, o seu IMC é de %.1f !", cal_Imc);
        }

        else if (cal_Imc >= 40) {
            System.out.printf("Você está com Obesidade Grau III ou Mórbida, o seu IMC é de %.1f !", cal_Imc);
        }

        altura.close();
        peso.close();

    }
}
