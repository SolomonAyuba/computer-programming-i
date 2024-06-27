public class week6StringManipulation {
        public static void main (String[] args) {

            //String Manipulation and Analysis Example

            String text3 = "Programming is very cool!";

            int length = text3.length();
            char firstChar = text3.charAt(0);
            String sub = text3.substring(14,21);
            String upperCase = text3.toUpperCase();
            String lowerCase = text3.toLowerCase();

            String trimmed = text3.trim();
            int indexOfIs = text3.indexOf("is");
            int lastIndex = text3.lastIndexOf("a");
            boolean startsWithProg = text3.startsWith("Prog");
            boolean endsWithExclamation = text3.endsWith("!");

            System.out.println("length: " + length);
            System.out.println("First Character: " + firstChar);
            System.out.println("Substring: " + sub);
            System.out.println("Upper Case: " + upperCase);
            System.out.println("Lower Case: " + lowerCase);

            System.out.println("Trimmed: " + trimmed);
            System.out.println("Index of 'is': " + indexOfIs);
            System.out.println("Last Index of 'a': " + lastIndex);
            System.out.println("Starts with'Prog': " + startsWithProg);
            System.out.println("Ends with '!': " + endsWithExclamation);
        }
    }