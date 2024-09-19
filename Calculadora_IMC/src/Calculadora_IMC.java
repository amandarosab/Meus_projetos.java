import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Vamos calcular o seu IMC! Digite a sua altura: ");
        Scanner altura = new Scanner(System.in);
        double altura1 = altura.nextFloat();
        
        System.out.println("Agora digite o seu peso: ");
        Scanner peso = new Scanner(System.in);
        double peso1 = peso.nextFloat();
        double cal_altura = (altura1*altura1);
        double cal_imc = (peso1/cal_altura);

        if (cal_imc <= 16) {
            System.out.printf("Você está com Magreza Grave, o seu IMC é de %.1f", cal_imc);
        }
        
        else if ((cal_imc >= 16) && (cal_imc < 16.9)) {
            System.out.printf("Você está com Magreza Moderada, o seu IMC é de %.1f !", cal_imc);
        }

        else if ((cal_imc >= 17) && (cal_imc < 18.5)) {
            System.out.printf("Você está com Magreza Leve, o seu IMC é de %.1f !", cal_imc);
        }

        else if ((cal_imc >= 18.6) && (cal_imc < 24.9)) {
            System.out.printf("Você está no Peso Ideal, o seu IMC é de %.1f !", cal_imc);
        }

        else if ((cal_imc >= 25) && (cal_imc < 29.9)) {
            System.out.printf("Você está com Sobrepeso, o seu IMC é de %.1f !", cal_imc);
        }

        else if ((cal_imc >= 30) && (cal_imc < 34.9)) {
            System.out.printf("Você está com Obesidade Grau I, o seu IMC é de %.1f !", cal_imc);
        }

        else if ((cal_imc >= 35) && (cal_imc < 39.9)) {
            System.out.printf("Você está com Obesidade Grau II ou Severa, o seu IMC é de %.1f !", cal_imc);
        }

        else if (cal_imc >= 40) {
            System.out.printf("Você está com Obesidade Grau III ou Mórbida, o seu IMC é de %.1f !", cal_imc);
        }

        altura.close();
        peso.close();

    }
}
