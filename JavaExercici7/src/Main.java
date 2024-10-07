import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String extra_hours = "";
        double nHours = 0;
        double extra_pay = 0;
        double normal_pay = 1250;

        System.out.println("Hello, your base salary is 1250€.");
        System.out.println("Have you done any extra hours? Yes / No");
        extra_hours = input.nextLine();


        while (!extra_hours.equalsIgnoreCase("Yes") && !extra_hours.equalsIgnoreCase("No")) {
            System.out.println("Please, input a valid answer (Yes/No)");
            extra_hours = input.nextLine();
        }

        switch (extra_hours){
            case "Yes":
            case "yes":
                System.out.println("Please, enter the number of extra hours done");

                while (!input.hasNextDouble()) {
                    System.out.println("Please, input a valid answer");
                    input.next();
                }

                nHours = input.nextDouble();


                if (nHours <= 5 && nHours >= 0){
                    extra_pay = nHours * 15;
                } else if (nHours > 5) {
                    extra_pay = 5 * 15 + (nHours - 5) * 12;
                } else
                    System.out.println("Invalid value.");
                break;

            case "No":
            case "no":
                extra_pay = 0;
                break;
        }

        System.out.println("Your salary is "+ (extra_pay + normal_pay) + " euros.");


    }
}