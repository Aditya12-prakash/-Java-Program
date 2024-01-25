import java.util.Scanner;

class TempConverter {
    public static void main(String[] args) {
        float a, b, TempF, TempC;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the temperature Fahrenheit");
        a = x.nextFloat();
        System.out.println("Enter the temperature Celcius");
        b = x.nextFloat();
        TempC = ((a - 32) * (5 / 9));
        TempF = (b * ((9 / 5) + 32));
        System.out.println(b + "Degree celcius is equal to " + TempF + " Fahrenheit And(&) " + a
                + "Fahrenheit is equal to " + TempC + "Degree celcius");
    }
}