import java.io.*;
public class week11_CustomSerialization {
    public static void main(String[] args) {
/*        class Employee implements Serializable {
            String name;
            transient int salary; // Marked as transient to exclude from serialization

            public Employee(String name, int salary) {
                this.name = name;
                this.salary = salary;
            }

            private void writeObject(ObjectOutputStream out) throws IOException {
                out.defaultWriteObject();
                out.writeObject(salary * 2); // Serialize salary * 2
                }
            private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
                    in.defaultReadObject();
                    salary = in.readInt() / 2; // Deserialize and adjust salary
                }
            }
            //Custom Serialization
            Employee employee = new Employee("Dan", 35000);

            // Serialization
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.ser"));
            outputStream.writeObject(employee);
            outputStream.close();

            // Deserialization
            ObjectOutputStream inputStream = new ObjectInputStream(new FileInputStream("employee.ser"));
            Employee deserializedEmployee = (Employee) inputStream.readObject();
            inputStream.close();

            System.out.println("Deserialized Employee: " + deserializedEmployee.name + " - " +
                    deserializedEmployee.salary);
*/        }

    }

