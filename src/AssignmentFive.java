import java.util.Scanner;

public class AssignmentFive {
    public static void main(String[] args) {
        System.out.println("To calculate the product of three integers such that\n" +
                "if input number is 7 consider only multiplication of digits to the right of 7\n" +
                "if the last digit is 7 then print -1");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter First Number: ");
        int a= sc.nextInt();
        System.out.println("enter Second Number: ");
        int b= sc.nextInt();
        System.out.println("enter First Number: ");
        int c= sc.nextInt();
        if(c==7)System.out.println(-1);
        else if (b==7) System.out.println(c);
        else System.out.println(a*b*c);
    }
}
