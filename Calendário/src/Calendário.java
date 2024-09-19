import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Calendário {
    public static void main(String[] args) throws Exception {

        // chamada para o usuário definir o ano desejado
        System.out.println("Você deseja visualizar os calendários de qual ano?");
        Scanner ano = new Scanner(System.in);
        int ano_user = ano.nextInt();

        // chamada para o usuário definir o mês desejado
        System.out.println("Você deseja visualizar o calendário de qual mês? Digite de 1 a 12");
        Scanner mes = new Scanner(System.in);
        int mes_user = mes.nextInt();

        // juntar informações
        DateTimeFormatter separar = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dt_user = "";           
        if (mes_user <=9) {
            dt_user = "01/0" + mes_user + "/" + ano_user;
        }

        else {
            dt_user = "01/" + mes_user + "/" + ano_user; 
        }

        DayOfWeek dia_semana = DayOfWeek.from(separar.parse(dt_user));
        // definição de quantidade de dias em cada mês
        int dia_mes = 0;
        switch (mes_user) {
            case 1:
                dia_mes = 31;
                break;

            case 2:
                dia_mes = 28;
                break;
                
            case 3:
                dia_mes = 31;
                break;
                
            case 4: 
                dia_mes = 30;
                break;
            
            case 5:
                dia_mes = 31;
                break;
                
            case 6: 
                dia_mes = 30;
                break;
                
            case 7: 
                dia_mes = 31;
                break;
                
            case 8:
                dia_mes = 31;
                break;
            
            case 9: 
                dia_mes = 30;
                break;

            case 10:
                dia_mes = 31;
                break;
                
            case 11:
                dia_mes = 30;
                break;
                
            case 12: 
                dia_mes = 31;
                break;    
        }

        // cabeçalho do calendário
        System.out.printf("D   S   T   Q   Q   S   S \n");

        // definição de espaço para dia da semana
        String semana = dia_semana.name();
        int calc_aux = 0;
        switch (semana) {
            case "SUNDAY":
                System.out.printf(""); 
                calc_aux = 0;
                break;
        
            case "MONDAY":
                System.out.printf("    ");
                calc_aux = 1;
                break;

            case "TUESDAY":
                System.out.printf("        ");
                calc_aux = 2;
                break;
                
            case "WEDNESDAY":
                System.out.printf("            ");
                calc_aux = 3;
                break;
                
            case "THURSDAY":
                System.out.printf("                ");
                calc_aux = 4;
                break;
                
            case "FRIDAY":
                System.out.printf("                    ");
                calc_aux = 5;
                break;
            
            case "SATURDAY":
                System.out.printf("                        ");
                calc_aux = 6;
                break;
        }

        // definição de loop for para confecção do calendário + criação de exceções
        for (int dia=1; dia<=dia_mes; dia++) {
           
           if (dia <= 9) {
                System.out.printf("0%d  ", dia);
           }
           
           else {
                System.out.printf("%d  ", dia);
           }

           // criação de quebras de linha para formatação do output
           if (dia==7 - calc_aux || dia==14 - calc_aux || dia==21 - calc_aux || dia==28 - calc_aux || calc_aux == 6 && dia == 29) {
                System.out.printf("\n");
            }
        }
        ano.close();
        mes.close();
    }
}    
