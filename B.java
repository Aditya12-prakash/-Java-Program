

class B {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int p, r, t, SI;
        System.out.println("Enter the principle Amount:");
        p = a.nextInt();
        System.out.println("Enter the Rate of intrest per year");
        r = a.nextInt();
        System.out.println("Enter the time ");
        t = a.nextInt();
        SI = (p * r * t) / 100;
        System.out.println("SI of the Given input is:" + SI);
    }
}