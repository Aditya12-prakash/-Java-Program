import java.util.Scanner;

class D {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a, b, sum, avg;
        System.out.println("Enter the first Number");
        a = x.nextInt();
        System.out.println("Enter the second Number");
        b = x.nextInt();
        sum = (a + b);
        System.out.println("The sum of Two number is:" + sum);
        avg = (sum / 2);
        System.out.println("The average of two number is:" + avg);
    }
}