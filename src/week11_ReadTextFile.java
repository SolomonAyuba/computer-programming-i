import java.io.*;

public class week11_ReadTextFile {
    public static void main(String[] args) {

        //Reading a Text File Line by Line
        try {
            FileReader fileReader = new FileReader("sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
            }

            bufferedReader.close();
        }   catch (IOException e) {
            System.out.println("An error occured: "+ e.getMessage());
        }
    }
}
