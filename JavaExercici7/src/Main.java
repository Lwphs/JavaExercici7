import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String extra_hours = "";
        double nHours = 0;
        double extra_pay = 0:
        double normal_pay = 1250;

        System.out.println("Hello, your base salary is 1250€.");
        System.out.print("Have you done any extra hours? Yes / No");
        extra_hours = input.next();
        input.nextLine();

        while (!extra_hours.equalsIgnoreCase("Yes") && !extra_hours.equalsIgnoreCase("No")) {
            System.out.println("Please, input a valid answer (Yes/No)");
            extra_hours = input.next();
        }

        switch (extra_hours){
            case "Yes":
            case "yes":
                System.out.println("Please, enter the number of extra hours done");
                nHours = input.nextDouble();
                input.nextLine();

                while (!extra_hours.hasNextDouble) {
                    System.out.println("Please, input a valid answer);
                    nHours = input.next();
                }

                if (nHours < 5 && nHours > 0){
                    
                }
                break;
        }


    }
}