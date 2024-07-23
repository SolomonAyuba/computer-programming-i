import java.io.*;
public class week11_ManipulatingDir {
    public static void main(String[] args) {
        File directory = new File("newdir");

        if (directory.mkdir()) {
            System.out.println("Directory created: " + directory.getName());

            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Files in the directory: ");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Failed to create the directory.");
        }

    }
}
