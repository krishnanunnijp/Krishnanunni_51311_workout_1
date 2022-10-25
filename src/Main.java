import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionHandler Question = new QuestionHandler();
        Question.printQuestion(1);
        Question.printQuestion(2);
        Question.printQuestion(3);
        Question.printQuestion(4);
        Question.printQuestion(5);
        Question.printQuestion(6);
        System.out.println("Enter the 0 to quit and enter the question number to get answer:");
        String input = sc.nextLine();
        while (!input.equals("0")) {
            Question.showAnswer(Integer.parseInt(input));
            System.out.println("Enter the 0 to quit and enter the question number to get answer:");
            input =sc.nextLine();
        }

    }
}