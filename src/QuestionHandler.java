import java.util.Scanner;

public class QuestionHandler {
    private Scanner sc = new Scanner(System.in);


    public void printQuestion(int questionNum) {
        switch (questionNum) {
            case 1:
                System.out.println("1. To convert the input temperature value in Fahrenheit to Celsius.");
                break;
            case 2:
                System.out.println("2. Program to generate a Triangle. eg:\n");
                System.out.println("1");
                System.out.println("22");
                System.out.println("333");
                System.out.println("4444\n");
                System.out.println("and so on upto the user input number.");
                break;
            case 3:
                System.out.println("3. To generate Fibonacci series up to the given input number using recursion.");
                break;
            case 4:
                System.out.println("4. To check whether the given input string is Palindrome or not (without string functions).");
                break;
            case 5:
                System.out.println("5. To display all the perfect square numbers between two input numbers interval.");
                break;
            case 6:
                System.out.println("6. Find whether the given character is vowel or consonant using switch control.");
                break;
            default:
                System.out.println("Enter a valid question number!!!");
                break;
        }

    }

    public void showAnswer(int questionNum) {
        switch (questionNum) {
            case 1:
                Fahren fahren = new Fahren();
                fahren.Measure();
                System.out.println(fahren.getCelsius());
                break;
            case 2:
                System.out.println("Enter a number to continue:");
                int num = sc.nextInt();
                Patterns pattern = new Patterns(num);
                pattern.generatePatterns();
                break;
            case 3:
                System.out.println("Enter the number of terms");
                int limit = sc.nextInt();
                FibonacciSeries fibonacci = new FibonacciSeries(limit);
                System.out.println(fibonacci.getSeries());
                break;
            case 4:
                System.out.print("Enter a string to check whether Palindrome or Not:");
                String palindromeString = sc.nextLine();
                PalindromeString palingString = new PalindromeString(palindromeString);
                palingString.printPalindromeOrNot();
                break;
            case 5:
                System.out.println("Enter the interval:");
                int start = sc.nextInt(), end = sc.nextInt();
                perfectSquares perfectSquares1 = new perfectSquares(start, end);
                System.out.println(perfectSquares1.getResult());
                break;
            case 6:
                System.out.println("Enter a character to check:");
                char input = sc.next().charAt(0);
                vowelCharacter vowelNumber1 = new vowelCharacter(input);
                System.out.println(vowelNumber1.getResult());
                break;
            default:
                System.out.println("Enter a valid question number!!!");
                break;
        }
    }
}
