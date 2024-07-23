import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;

public class week11 {
    public static void main(String[] args){
/*
        // For spacing between codes
        String space = "---------";
        System.out.println(space + "WEEK 11: Streams and Files | Mon 21st July 2024" + space);
        //WEEK 11: Streams and Files | Mon 21st Jul, 2024

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenSquares = numbers.stream()
                .filter(n –> n % 2 == 0);
                .map(n - > n * n)
                .collect(Collectors.toList());

        System.out.println("Even Squares: " + evenSquares + "\n\n");


        // Using Terminal Operations
        class TerminalOperationExample{
            long count = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .count();

            System.out.println("Count of even numbers: " + count);
        }

        // Parallel Streams
        class ParallelStreamExample{
            long count = numbers.parellelStream()
                    .filter(m-> n % 2 ==0)
                    .count();
            System.out.println("Count of even numers (parallel): " + count);
        }

        /*
        Mid-lesson question
        You have been given a list of integers representing exam scores of students.
        Your task is to process this list using Java streams to achieve the following:
        • Filter out scores that are less than 60.
        • Double each remaining score.
        • Find and display the sum of the doubled scores.
        Write a Java program to achieve this using streams and lambda expressions.
         */
/*
        class ExamScoreProcessing{
            List<Integer> scores = Arrays.asList(78, 45, 92, 60, 30, 85, 73, 58, 91);

            int sumOfDoubledScores = scores.stream()
                    .filter(score -> score >= 60)
                    .mapToInt(score -> score * 2)
                    .sum();
            System.out.println("Sum of the doubled scores: " + sumOfDoubledScores);
        }
*/


    }

}
