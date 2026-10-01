import java.util.Scanner;

public class SmartToll {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Select number plate.
        System.out.print("Numer Plate: ");
        String plate = s.nextLine();
        // Select vehicle type.
        System.out.print("Vehicle Type(MOTORBIKE, TOURISM, TRUCK, BUS): ");
        String vehicle = s.nextLine();
        // Select number of axles.
        System.out.print("Number of Axles: ");
        int axles = Integer.parseInt(s.nextLine());
        // Select time.
        System.out.print("Hour(0-23): ");
        double hour = Double.parseDouble(s.nextLine());
        // Select number of passengers.
        System.out.print("Number of Passengers: ");
        int passengers = Integer.parseInt(s.nextLine());
        // Select remote payment device.
        System.out.print("Remote Payment Device(Y/N):");
        String paymentDeviceYN = s.nextLine();

        // Security Check.
        if ((plate.length() != 7) || (axles < 2 && !"MOTORBIKE".equals(vehicle)) || (passengers <= 0)) {
            System.out.print("ERROR: Not valid sensor reading /Possible Fraud.");
            return;
        }

        // Base rate.
        double baseRate = 0.0;
        double axlesExtra = 0.0;

        switch(vehicle){
            case "MOTORBIKE":
                baseRate = 2.0;
                break;
            case "TOURISM":
                baseRate = 5.0;
                break;
            case "TRUCK":
                baseRate = 10.0;
                if (axles > 3) {
                    axlesExtra = (axles - 3) * 3.5;
                }
                break;
            case "BUS":
                baseRate = 8.0;
                break;
            default:
                System.out.print("ERROR: Not valid sensor reading /Possible Fraud.");
                return;
        }

        // Time slots and carpooling.
        double total = 0.0;
        double surchargeHour = 0.0;
        double discountHour =0.0;

        if ((hour >= 7.0 && hour <= 9.0) || (hour >= 18.0 && hour <=20.0)) {
            if (!"TOURISM".equals(vehicle)) {
            surchargeHour = 1.20; 
            total = (baseRate + axlesExtra) * surchargeHour;
            } else if ("TOURISM".equals(vehicle) && passengers < 3) {
                surchargeHour = 1.20; 
                total = (baseRate + axlesExtra) * surchargeHour; 
            } else if ("TOURISM".equals(vehicle) && passengers >= 3) {
                discountHour = 0.90; 
                total = (baseRate + axlesExtra) * discountHour; 
            }    
        } else if (hour >= 23.0 || hour <= 6.0) {
            discountHour = 0.70;
            total = (baseRate + axlesExtra) * discountHour;
        } else if ((hour > 9.0 && hour < 18.0)) {
            total = (baseRate + axlesExtra);
        }

        // Telepayment discount
        Boolean paymentDevice = false;
        double discountFinal = 0.0;

        switch(paymentDeviceYN) {
            case "Y":
                paymentDevice = true;
                break;
            case "N":
                paymentDevice = false;
                break;
        }
        
        if (paymentDevice){
            discountFinal = 0.85;
            total = total * discountFinal;
        }

        System.out.print(total);
    }
}