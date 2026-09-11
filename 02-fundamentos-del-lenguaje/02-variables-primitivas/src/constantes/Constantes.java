package constantes;


public class Constantes {
    public static void main(String[] args) {
        final double TAX_RATE = 0.35;
        int grossSalary = 20000;
        
        double netSalary = grossSalary * (1 - TAX_RATE);

        System.out.println("Net Salary: " + netSalary);
    }
}
