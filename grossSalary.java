import java.util.Scanner;
class grossSalary{
    public static void main(String[] args)
    {
      int salary,Pf,Ta,Ha,baseSalary;
      Scanner a= new Scanner(System.in);
      System.out.println("Enter the Salary of the person:");
      salary=a.nextInt();
      Pf=(salary/10);
      Ta= (salary/20);
      Ha=(salary/20);
      baseSalary=salary-Pf-Ta-Ha;
      System.out.println("Salary of employe is "+salary+" In which Basesalary is "+baseSalary+" Travel allowances is "+Ta+" Provident fund is "+Pf+" Health allowances is "+Ha);
    }
}