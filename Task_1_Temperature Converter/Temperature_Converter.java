import java.util.Scanner;

public class Temperature_Converter {

    public static void main(String[] args) {
        
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Conversion Tool");
        System.out.println("----------------------------");
        
        System.out.println("Enter Current Temperature Unit ");
        System.out.println("1. Enter C for Celsius \n2. Enter F for Fahrenheit");
        System.out.print("\nEnter Your Choice : ");
        String scale = sc.next();
           
      
        double celsius;
        switch(scale.toUpperCase()) {
            case "C":
                System.out.print("\nEnter Temperature Value: ");
                double temp = sc.nextDouble();  
                celsius = temp;
                double fahrenheit = celsius * 9 / 5 + 32;
                System.out.println("\nTemperature in Celsius : " + temp + " C");
                System.out.println("Temperature in Fahrenheit : " + fahrenheit + " F\n");
                break;
            case "F":
                System.out.print("\nEnter Temperature Value: ");
                double temp1 = sc.nextDouble();  
                celsius = (temp1 - 32) * 5 / 9;
                System.out.println("\nTemperature in Fahrenheit : " + temp1 + " F");
                System.out.println("Temperature in Celsius : " + celsius + " C\n");
                break;
            default:
                System.out.println("\nThis is not a Valid Temperature Scale\n");
                return;
        }
      

    }

}