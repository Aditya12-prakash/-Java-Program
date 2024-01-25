import java.util.*;

class TenSumOfnumber {
    public static void main(String[] args) {
        int x, i;
        int sum = 0;
        int product = 1;
        Scanner y = new Scanner(System.in);
        System.out.println("Enter the total element which you want to Store in array");
        x = y.nextInt();
        int a[] = new int[x];
        System.out.println("Enter the element of array");
        for (i = 0; i < x; i++) {
            a[i] = y.nextInt();
        }
        for (i = 0; i < x; i++) {
            if ((a[i] % 2) == 0) {
                sum = sum + a[i];
            } else {
                product = product * a[i];
            }
        }
        System.out.println("Sum of the number is: " + sum);
        System.out.println("Product of the number is:" + product);

    }
}