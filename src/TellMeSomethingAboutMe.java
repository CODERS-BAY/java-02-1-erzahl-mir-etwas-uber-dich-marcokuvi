import java.util.Scanner;

public class TellMeSomethingAboutMe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How is your forname?");
        String forname = scan.next();
        System.out.println("And your surname?");
        String surname = scan.next();
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println("Are you married?");
        boolean status = scan.nextBoolean();
        System.out.println("How tall are you?");
        double height = scan.nextDouble();
        System.out.printf("name: %s %s age: %d status: %b height: %f",forname, surname, age, status, height);

    }
}
