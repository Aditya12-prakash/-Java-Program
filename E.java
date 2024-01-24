import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x, year, month, Days, temp1;
        System.out.println("Enter the number of Days:");
        x = a.nextInt();
        year = (x / 365);
        temp1 = (x % 365);
        month = (temp1 / 30);
        Days = (temp1 % 30);
        System.out.println("The " + x + " Days is equal to " + year + " Years " + month + " Month " + Days + " Days.");
    }

}
