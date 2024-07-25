public class main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Jerry", 500);
        account1.deposit(100);
        account1.printInfo();

        BankAccount account2 = new BankAccount("Larry", 5000);
        BankAccount account3 = new BankAccount("Mary", 300);
        account2.withdraw(100);
        account3.deposit(100);
        account2.printInfo();
        account3.printInfo();

        Product product1 = new Product(4, 10, "Gallon of gas");
        product1.printProduct();
        product1.totalCost();
    }
}
