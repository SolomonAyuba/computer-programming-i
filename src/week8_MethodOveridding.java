public class week8_MethodOveridding {
    public static void main(String[] args) {
        /*
        Polymorphism
        Polymorphism is the ability of objects of dierent classes to be treated as objects of a common superclass.
        It promotes flexibility and extensibility in code design.

        Method Overriding
        Subclasses can provide their own implementation for a method inherited from a superclass.
        Method overriding allows customization of behaviour in subclasses.
        Example
         */
        class Animal2{
            void makeSound(){
                System.out.println("Animal makes a sound.");
            }
        }
        class Dog2 extends Animal2 {
            void makeSound() {
                System.out.println("Dog barks.");
            }
        }

        /*
        Dynamic Method
        During runtime, the appropriate method implementation is called based on the actual object’s type.
        This allows for polymorphic behaviour based on the object’s dynamic type.
        Example
         */

        Animal2 anAnimal = new Dog2();
        anAnimal.makeSound(); // Output: "Dog Barks"

    }
}
