import java.util.Scanner;

class findlargestNum {
    public static void main(String[] args) {
        int a, b, c;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        a = x.nextInt();
        System.out.println("Enter the First Number:");
        b = x.nextInt();
        System.out.println("Enter the First Number:");
        c = x.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println(a + " is the Biggest number in all");
        } else if ((b > a) && (b > c)) {
            System.out.println(b + " is the Biggest number in all ");
        } else {
            System.out.println(c + " is the Biggest number in all");
        }
    }
}