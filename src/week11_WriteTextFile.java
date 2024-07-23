import java.io.*;
public class week11_WriteTextFile {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("This is a text file.");

            bufferedWriter.close();
        }   catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
