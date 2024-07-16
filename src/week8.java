public class week8 {
    public static void main(String[] args) {

        // For spacing between codes
        String space = "---------";
        System.out.println(space + "WEEK 8: Encapsulation, Inheritance and Polymorphism | Monday 15th July, 2024"
                + space);

        //WEEK 8: Encapsulation, Inheritance and Polymorphism | Monday 15th July, 2024
    /*
    Accessors (Getters) and Mutators (Setters)
        Accessors (getters) provide controlled access to private attributes. Mutators (setters) allow controlled
        modification of private attributes.
        Example: encapsulation with Getters and Setters
     */
        class BankAccount {
            private String accountNumber;
            private double balance;

            public BankAccount(String accountNumber) {
                this.accountNumber = accountNumber;
                this.balance = 0.0;
            }

            public void deposit(double amount) {
                balance += amount;
            }

            public void withdraw(double amount) {
                balance -= amount;
            }

            public double getBalance() {
                return balance;
            }
        }
        BankAccount account = new BankAccount("123456");
        account.deposit(1000);
        account.withdraw(500);

        double balance = account.getBalance();
        System.out.println("Account Balance: " + balance);

     /*
        Mid-lesson question
        You are tasked with designing a simplified online shopping system in Java.
        1. Create a class Product to represent products
        available for purchase on the online platform. Each product has the following aributes:
        productId (int), productName (String), price (double) and quantityInStock (int)
        The class should have the following methods: Constructor, getProductId(), getProductName(),
        getPrice(), getQuantityInStock(), updateQuantity(int newQuantity) and displayProductInfo()
        2. Create multiple instances of the Product class to represent dierent products available in the online store.
        3. Demonstrate the encapsulation principle by accessing the aributes through methods and abstracting the
         inner details of the Product class.
         */

        // Creating Instances of the Product class
        Product product1 = new Product(1, "Laptop", 899.99, 10);
        Product product2 = new Product(2, "smartphone", 599.99, 25);

        //Display product information
        product1.displayProductInfo();
        product2.displayProductInfo();

        // update quantity and display updated information
        product1.updateQuantity(8);
        product1.displayProductInfo();

    }
}
         class Product {
            private int productId;
            private String productName;
            private double price;
            private int quantityInStock;


         public Product (int productId, String productName, double price, int quantityInStock){
            this.productId = productId;
            this.productName = productName;
            this.price = price;
            this.quantityInStock = quantityInStock;
            }

            // Getters
            public int getProductId(){
                return productId;
            }
            public String getProductName(){
                return productName;
            }
            public double getPrice(){
                return price;
            }
            public int getQuantityInStock(){
                return quantityInStock;
            }

            // Method to update quantity
             public void updateQuantity(int newQuantity){
                if (newQuantity >= 0){
                    quantityInStock += newQuantity;
                } else {
                    System.out.println("Invalid Quantity");
                }
            }

            // Method to display product information
            public void displayProductInfo() {
                System.out.println("Product Id: " + productId);
                System.out.println("Product Name: " + productName);
                System.out.println("Price: $" + price);
                System.out.println("Quantity In Stock: " + quantityInStock);
            }

        }
            /*
            Inheritance
            Use the extends keyword to create a subclass. Example
             */
        class Animal{
            void eat(){
                // Implementation
            }
        }
        class Dog extends Animal{
            void bark(){
                // Implementation
            }
        }
        // Inheritance Example in week8_Inheritance
        // Method Overriding in week8_MethodOveridding
        // Polymorphism, Interfaces: Example in week8_Polymorphism

