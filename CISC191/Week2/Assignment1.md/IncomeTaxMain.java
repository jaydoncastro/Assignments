import java.util.Scanner;

public class IncomeTaxMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] salaryTable = {0, 20000, 50000, 100000};
        double[] taxRateTable = {0.1, 0.2, 0.25, 0.3};

        TaxTableTools taxTool = new TaxTableTools(salaryTable, taxRateTable);

        while (true) {
            System.out.print("Enter annual salary (-1 to quit): ");
            int salary = sc.nextInt();

            if (salary == -1) {
                break;
            }

            double rate = taxTool.getTaxRate(salary);
            double tax = rate * salary;

            System.out.println("Tax rate: " + (rate * 100) + "%");
            System.out.println("Tax to pay: $" + tax);
        }
        sc.close();
    }
}
