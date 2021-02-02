import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        System.out.println("IMPLEMENTATION OF A PROGRAM TO FIND\n AREA OF CIRCLE.");
        System.out.println("enter the radius: ");
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        double pi = 3.14;
        double area= pi*r*r;
        System.out.printf("Area of circle with radius %d is %.2f",r,area);
    }
}
