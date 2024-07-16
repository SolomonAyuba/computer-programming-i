public class week8_Inheritance {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        shape.display();
        //output: "This is a shape."
        circle.display();
        //output: "This is a circle."
        rectangle.display();
        //output: "This is a rectangle."
    }
}

    // Example: Using Inheritance for Shape Hierarchy
    class Shape {
        void display() {
            System.out.println("This is a Shape.");
        }
    }

    class Circlex extends Shape {
        @Override
        void display() {
            System.out.println("This is a Circle.");
        }
    }

    class Rectanglex extends Shape {
        @Override
        void display() {
            System.out.println("This is a Rectangle.");
        }
    }
