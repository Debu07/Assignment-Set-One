import java.util.Scanner;

public class AssignmentThree{
    public static void main(String[] args) {
        System.out.println("To display the sum of two numbers,\n if the numbers" +
                "are same. If the numbers are different double the sum.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();
        int sum=n1+n2;
        if(n1==n2) System.out.println(sum);
        else System.out.println(sum+sum);
    }
}
