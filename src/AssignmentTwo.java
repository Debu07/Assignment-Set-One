import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
        System.out.println("Temperature conversion from FAHRENHEIT to CELSIUS");
        System.out.println("Enter the temperature in Fahrenheit");
        Scanner sc= new Scanner(System.in);
        int temp= sc.nextInt();
        double c=((temp-32)/9)*5;
        System.out.printf("Temperature in Celsius is: %.1f",c);
    }
}
