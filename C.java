import java.util.Scanner;

class C {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b;
        System.out.println("Enter the number which you want to check");
        b = a.nextInt();
        if (b % 2 == 0) {
            System.out.println("It is a Even Number");
        } else {
            System.out.println("It is a Odd Number");
        }
    }
}