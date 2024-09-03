import java.util.Scanner;

class Bank {
    private int id;
    private String name;
    private String accountNumber;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class Customer extends Bank {
   
    public void recordFetch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        setId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter Name: ");
        setName(scanner.nextLine());

        System.out.print("Enter Account Number: ");
        setAccountNumber(scanner.nextLine());

        System.out.print("Enter Amount: ");
        setAmount(scanner.nextDouble());
    }

    
    public void displayRecord() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Amount: " + getAmount());
    }

 
    public void amountBal() {
        double interest = getAmount() * 0.075; 
        System.out.println("Amount after 7.5% interest: " + (getAmount() + interest));
    }
}

public class Inheritance_sigle{
    public static void main(String[] args) {
        Customer c = new Customer();
        c.recordFetch(); 
        c.displayRecord(); 
        c.amountBal(); 
    }
}
