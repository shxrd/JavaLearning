import java.util.Scanner;

public class JavaLearning {
    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner =  new Scanner(System.in);

                String input = scanner.next();

                    System.out.println("Hello, " + input + ".");

            System.out.println("\nHow old are you?");

                int age = scanner.nextInt();

                System.out.println(age + "?" + " Wow, you're getting older!");
    }
}