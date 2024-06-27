public class week7 {
    public static void main(String[] args) {

    // For spacing between codes
    String space = "---------";
        System.out.println(space + "WEEK 7: Object Oriented Programming (OOP)  | Monday 24th June, 2024" + space);

        //WEEK 7: Object Oriented Programming,	Monday 24th June, 2024

        /*
        Defining a Class
        A class is a template for creating objects with shared attributes and behaviours. Attributes are also known as
        fields or properties.
        Behaviours are implemented as methods.
        Example -
         */
        class Student {
            String firstName;
            int age;

            void study() {
                System.out.println(firstName + " is studying.");
                }
        }

        /*
            //Creating Objects
            Objects are instances of a class.
            Use the 'new' keyword to create objects.
            Example
        */
             Student student1 = new Student();
             Student student2 = new Student();

             student1.firstName = "Dan";
             student1.age = 19;

             student2.firstName = "Jess";
             student2.age = 18;

        /*  Accessing Object Members
             Use the dot (.) operator to access object members (fields and methods).
            Example
         */
            System.out.println(student1.firstName); //Output: "Dan"
            student2.study(); // Output: "Jess is studying."

        /*
             Object Identity
            Each object has a unique identity and its own set of attributes.
            Objects are separate instances and can have different attribute values. Example
        */
            student1.study(); // Output: "Dan is studying."
            student2.study(); // Output: "Jess is studying."

        System.out.println(space + "Bank Account Class and objects" + space);
        /*
            Real-World Analogy: Building Houses
            Think of a class as a blueprint for building a house (object).
            Each house (object) has its own attributes (rooms, size, location).
            House (object) can perform similar behaviours (opening doors, turning on lights).
            Example: Bank Account Class and Objects
        */
            class BankAccount {
                String accountNumber;
                double balance;

                void deposit(double amount){
                    balance += amount;
                }

                void withdraw(double amount) {
                    balance -= amount;
                }
            }

            // public class Main{
            class Main{
                public static void main(String[] args){
                    BankAccount account1 = new BankAccount();
                    account1.accountNumber = "85690";
                    account1.balance = 1000.0;

                    BankAccount account2 = new BankAccount();
                    account2.accountNumber = "14387";
                    account2.balance = 500.0;

                    account1.deposit(200.0);
                    account2.withdraw(100.0);

                    System.out.println("Your " + account1.accountNumber + " balance is: " + account1.balance);
                    System.out.println("your other account " + account2.accountNumber + " balance is: "
                            + account2.balance);
                }
            }


            // Mid Lesson Exercise in: src/Week7_MidLessonQuestion.java


        /*
        CONSTRUCTORS:

        In Java, a constructor is a special type of method that is used to initialize objects when they are
        created from a class. It’s responsible for setting up the initial state of the object by assigning values
         to its instance variables and performing any necessary setup tasks.

        A class with constructors:
        */
        class car {
            private String make;
            private String model;

            // Default constructor
            public car(){
                make = "Unknown";
                model = "Unknown";
            }

            // Parameterized constructor
            public car(String make, String model){
                this.make = make;
                this.model = model;
            }
        }


        /*
            //Access Modifiers: Access modifiers control the visibility and accessibility of classes, fields, methods, and constructors.
            //They help in enforcing encapsulation and defining the scope of class members.

            //Example: Access Modifiers


        public class BankAccount {
            public String accountNumber;           // Public field accessible from anywhere
            private double balance;               // Private field accessible only within the class
            String accountType;                  // Default (package-private) field accessible within the same package
            protected String ownerName;         // Protected field accessible within the same package and subclasses

            public double getBalance() {
                return balance;
            }

            private void deductFee(double feeAmount) {
                balance -= feeAmount;
            }
        }

         */

            //Example II: Access Modifiers
         /*
        public class BankAccount {
            public String accountNumber;       // Public field accessible from anywhere
            private double balance;           // Private field accessible only within the class
            String accountType;              // Default (package-private) field accessible within the same package
            protected String ownerName;     // Protected field accessible within the same package and subclasses

            void displayAccountInfo() {
             System.out.printIn("Balance: " + balance);
            }

            protected void applyInterest (double rate) {
                balance += balance * rate / 100;
            }
        }
         */

        /*
        //Special Keywords: This
          Refers to the current instance of the class.
          Used to distinguish between instance variables and method parameters with the same name. Example
        */
        /*
        public class Main {
            int x;

            // Constructor with a parameter
            public Main(int x) {
                this.x = x;
            }

            // Call the constructor
            public static void main (String[] args) {
                Main myData = new Main(10);
                System.out.printIn("Value of x = " + myData.x);
            } //this Outputs("Value of x = 10)


         // Special Keywords: Super
            Refers to the superclass or parent class.
            Used to access superclass members when they are overridden in subclasses.
            Example:

        class child extends Parent {
            void display() {
                // Calls parent class's display method
                super.display();
            }
        }

        // Special Keywords: Static
        Special Keywords: static
        Used to create class-level members that are shared among all instances. Shared variables are stored in memory once for the entire class.
        Example:


       class Mathclass {
            // Shared constant
            static final double PI = 3.14159;
            static int add(int a, int b) {
                return a + b;
            }
        }

    */

    }
}