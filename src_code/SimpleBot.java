package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Anurag's assistant", "2021");
        remindName();
        guessAge();
        count();
        questions();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }
    static void questions() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which company created JAVA and who led the project and in which year ?");
        System.out.println("1. Oracle created JAVA and the project was led by Linus Torvalds in 1991 ");
        System.out.println("2. Oracle created JAVA and the project was led by James Gosling in 1991 ");
        System.out.println("3. Sun Microsystems created JAVA and the project was led by James Gosling in 1991 ");
        System.out.println("4. Sun Microsystems created JAVA and the project was led by James Gosling in 1999 ");
    }
    static void test() {
        int option = scanner.nextInt();
        if(option != 3) {
            System.out.println("Please, try again.");
            test();
        }
    }

    static void end() {

        System.out.println("Congratulations, have a nice day!");
    }
}

