import java.util.Scanner;

public class AssignmentFour {
    public static void main(String[] args) {
        System.out.println("To find roots of the equation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();
        double D=b*b-4*a*c;
        //double dis= Math.pow(D,1/2);
        double root1=(-b+D)/2*a;
        double root2=(-b-D)/2*a;
        if (D==0) System.out.println("Value of both the roots is same:"+root1);
        else if (D>0) System.out.println("root 1= "+root1+" root 2= "+root2);
        else System.out.println("The equation has no real roots.");
    }
}
