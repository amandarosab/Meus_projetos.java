import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int age = 0;
        Scanner valor = new Scanner(System.in);

        while (age < 100) {
        System.out.println(" \n Digite a sua idade para receber uma verdade sobre você: ");
        age = valor.nextInt();
        
            if ((age >= 0 && age < 14)) {
            System.out.printf("Saí daqui, ladrãozinho(a) superdotado(a)!", age);
            }

            else if ((age >= 15 && age <= 18)) {
            System.out.printf("Tão jovem e já aqui, o seu futuro é brilhante!", age);
            }

            else if ((age >= 19 && age <= 25)) {
            System.out.printf("As suas costas começarão a doer logo logo...", age);
            }

            else if ((age >= 26 && age <= 31)) {
            System.out.printf("Eu sei que você não consegue mais ver um filme sem cochilar!", age);
            }
            
            else if (age >= 32 && age <= 36) {
            System.out.printf("Já tomou o seu remédio controlado hoje?", age);
            }

            else if ((age >=37 && age <= 46)) {
            System.out.printf("Lembre-se: a idade é apenas um número. E no seu caso, é um número um bem grande rsrsrs", age);
            }
            
            else if ((age >=47 && age <= 54)) {
            System.out.printf("Já colecionou a maioria né? Das histórias para contar para os seus netos kkkkkkkk", age);
            }

            else if ((age >= 55 && age <= 65)) {
            System.out.printf("Agora você já pode usar a expressão 'no meu tempo…' sem parecer antiquado.", age);
            }

            else if ((age >= 66 && age <= 74)) {
            System.out.printf("Você é oficialmente um 'sênior', já furou a fila do supermercado hoje?", age);
            }

            else if ((age >= 75 && age <= 84)) {
            System.out.printf("Nooossaaa, você chegou na época de usar meias brancas com sandálias e ninguém vai julgar", age);
            }

            else if ((age >= 85 && age <= 100 )) {
            System.out.printf("Meu Deus, você é uma relíquia! Parabéns por atingir essa idade, só tome cuidado pois as velas do seu bolo de aniversário podem causar um incêndio", age);
            }
        valor.nextLine();
        }
        valor.close();
    }   
}