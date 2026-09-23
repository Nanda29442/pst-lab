import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        double balance = 0.0;
        
        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            double amount = sc.nextDouble();
            
            if (operation.equalsIgnoreCase("Deposit")) {
                balance += amount;
            } else if (operation.equalsIgnoreCase("Withdraw")) {
                balance -= amount;
            }
        }
        
        
        if (balance == (long) balance) {
            System.out.println((long) balance);
        } else {
            System.out.println(balance);
        }
        
        sc.close();
    }
}

Sample Input
3
Deposit 5000
Withdraw 2000
Deposit 1000
Sample Output
4000
