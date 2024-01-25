import java.util.Scanner;

class AreaOfRectangle {
    public static void main(String[] args) {
        int a, b, area;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Length of Rectangle");
        a = x.nextInt();
        System.out.println("Enter the breadth of Rectangle");
        b = x.nextInt();
        area = a * b;
        System.out.println(area + " is the area of Rectangle");
    }
}