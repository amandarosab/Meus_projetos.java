import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        // SISTEMA PARA TEMPERATURA DE CASA
        boolean airConditioner = false;
        boolean heater =  false;
        boolean sensor1 = true; // sensor de funcionamento para ar condicionado, deve ser igual a true 
        boolean sensor2 =  true; // sensor de funcionamento para aquecedor, deve ser igual a true
        double termometer = 23; // entrada de verificação de temperatura da casa

        System.out.println("TEMPERTURE HOUSE CONTROLLER");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's the temperture of your house?");
        termometer = sc.nextDouble();

        System.out.println("\nWhat's the status of the Sensor 1? (ON: true or OFF: false)");
        sensor1 = sc.nextBoolean();

        System.out.println("\nWhat's the status of the Sensor 2? (ON: true or OFF: false)");
        sensor2 = sc.nextBoolean();

        if (sensor1 == true && termometer > 25) {
            heater = false;
            airConditioner = true;
            System.out.println("\nIT'S HOT, the Air Conditioner successfully turned on :)\n");
            System.out.println("Heater is off!");
        }
        else if (sensor2 == true && termometer <= 25) {
            airConditioner = false;
            heater = true;
            System.out.println("\nAir Conditioner off!\n");
            System.out.println("IT'S COLD, The Heater successfully turned on :)");
        }
        if(sensor1 == false) {
            airConditioner = false;
            System.out.println("\nThe Air Conditioner isn't working\n");
        }
        if(sensor2 == false) {
            heater = false;
            System.out.println("The Heater isn't working\n");
        }

        sc.close();
    }
}
