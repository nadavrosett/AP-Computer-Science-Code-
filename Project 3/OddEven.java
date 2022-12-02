import java.util.Scanner;

class OddEven {
    // Get a number and print odd, even, and zero digits
    public static void main(String[] args) {

        System.out.println("Please enter a positive integer:");
        String num;
        try (Scanner scan = new Scanner(System.in)) {
            num = scan.nextLine();
        }
        int zeroCounter = 0;
        int evenCounter = 0;
        int oddCounter = 0;

        for (int i = 0; i < num.length(); i++) {
            String digitAsString = num.substring(i, i + 1);
            int digit = Integer.valueOf(digitAsString);

            if (digit == 0) {
                zeroCounter++;
            } else if (digit % 2 == 0) {
                evenCounter++;
            } else if (digit % 2 != 0) {
                oddCounter++;
            }
        }
        System.out.println("Zeros: " + zeroCounter);
        System.out.println("Evens: " + evenCounter);
        System.out.println("Odds: " + oddCounter);

    }
}
