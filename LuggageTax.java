import java.util.Scanner;

public class LuggageTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        String hasPriorityTicket = scan.nextLine();

        int volume = width * height * length;
        double price = 0;

        if (volume >= 50 && volume <= 100) {
            if ("false".equals(hasPriorityTicket)) {
                price = 25;
            }
        } else if (volume > 100 && volume <= 200) {
            if ("true".equals(hasPriorityTicket)) {
                price = 10;
            } else {
                price = 50;
            }
        } else if (volume > 200 && volume <= 300) {
            if ("true".equals(hasPriorityTicket)) {
                price = 20;
            } else {
                price = 100;
            }
        }

        System.out.println(String.format("Luggage tax: %.2f", price));
    }
}
