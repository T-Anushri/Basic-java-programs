import java.io.*;
import java.util.*;
public class Bank{
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("bank.txt",true);
            PrintStream p = new PrintStream(fs);
            Scanner scanner = new Scanner(System.in);
            int principal, emi1 = 0, emi2 = 0, t;
            System.out.print("Enter the principal amount: ");
            principal = scanner.nextInt();
            p.println("Principal amount: " + principal);
            System.out.print("Enter the tenure in years: ");
            t = scanner.nextInt();
            p.println("Tenure in years: " + t);
            int n1, n2;
            System.out.print("Enter number of slabs for Bank A: ");
            n1 = scanner.nextInt();
            p.println("Number of slabs for Bank A: " + n1);
            float[] r1 = new float[n1];
            int[] p1 = new int[n1];
            System.out.print("Enter period and interest rate for each slab for Bank A: ");
            p.println("Period and interest rate for Bank A:");
            for (int i = 0; i < n1; i++) {
                p1[i] = scanner.nextInt();
                r1[i] = scanner.nextFloat();
                p.println(p1[i] + " " + r1[i]);
            }
            System.out.print("Enter number of slabs for Bank B: ");
            n2 = scanner.nextInt();
            p.println("Number of slabs for Bank B: " + n2);
            float[] r2 = new float[n2];
            int[] p2 = new int[n2];
            System.out.print("Enter period and interest rate for each slab for Bank B: ");
            p.println("Period and interest rate for Bank B:");
            for (int i = 0; i < n2; i++) {
                p2[i] = scanner.nextInt();
                r2[i] = scanner.nextFloat();
                p.println(p2[i] + " " + r2[i]);
            }
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < p1[i]; j++) {
                    emi1 += principal * r1[i] / (1 - 1 / Math.pow((1 + r1[i]), t * 12));
                }
            }
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < p2[i]; j++) {
                    emi2 += principal * r2[i] / (1 - 1 / Math.pow((1 + r2[i]), t * 12));
                }
            }
            if (emi1 > emi2) {
                System.out.println("EMI of BANK A: " + emi1 + " is greater than EMI of BANK B: " + emi2 +" Hence choose Bank B");
                p.println("EMI of BANK A: " + emi1 + " is greater than EMI of BANK B: " + emi2 +" Hence choose Bank B");
            } else if (emi1 == emi2) {
                System.out.println("EMI of BANK A: " + emi1 + " is same as EMI of BANK B: " + emi2 +" Hence choose either banks");
                p.println("EMI of BANK A: " + emi1 + " is same as EMI of BANK B: " + emi2 + " Hence choose either banks");
            } else {
                System.out.println("EMI of BANK A: " + emi1 + " is lesser than EMI of BANK B: " + emi2 + " Hence choose Bank A");
                p.println("EMI of BANK A: " + emi1 + " is lesser than EMI of BANK B: " + emi2 + " Hence choose Bank A");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
