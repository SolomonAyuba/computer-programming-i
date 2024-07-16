public class week8_Polymorphism {
    public static void main(String[] args) {
        // Example: Polymorphism in Shape Hierarchy

        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();

        for (Shape shape : shapes) {
            shape.display();
        }

        /* Outputs
            This is a shape
            This is a circle
            This is a rectangle
         */

        // Example: Using Interfaces for Shape Calculations

        Shape3 circle2 = new Circle2(5);
        Shape3 rectangle2 = new Rectangle2(4, 6);

        System.out.println("Circle Area: " + circle2.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle2.calculatePerimeter());
    }
}

        // Example: Using Inheritance for Shape Hierarchy
        class Shapex {
            void display() {
                System.out.println("This is a Shape.");
            }
        }

        class Circle extends Shape {
            @Override
            void display() {
                System.out.println("This is a Circle.");
            }
        }

        class Rectangle extends Shape {
            @Override
            void display() {
                System.out.println("This is a Rectangle.");
            }
        }

        // Declaring Interfaces and Implementing Them
        interface Shape3 {
            double calculateArea();
            double calculatePerimeter();
        }

        class Circle2 implements Shape3 {
            double radius;

            Circle2(double radius) {
                this.radius = radius;
            }

            public double calculateArea() {
                return Math.PI * radius * radius;
            }

            public double calculatePerimeter() {
                return 2 * Math.PI * radius;
            }
        }

        class Rectangle2 implements Shape3 {
            double width;
            double height;

            Rectangle2(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public double calculateArea() {
                return width * height;
            }

            public double calculatePerimeter() {
                return 2 * (width + height);
            }
        }
