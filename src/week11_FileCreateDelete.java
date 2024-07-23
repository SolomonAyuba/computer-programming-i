import java.io.*;
public class week11_FileCreateDelete {
    public static void main(String[] args) {
        File file = new File("newfile.txt");

        try{
            if (file.createNewFile()){
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            if (file.delete()){
                System.out.println("File deleted. " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
