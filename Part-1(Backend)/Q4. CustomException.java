// Custom Exception Class
class MultipleDigitsException extends Exception {
    public MultipleDigitsException(String message) {
        super(message);
    }
}

// Main Class
public class SingleDigitChecker {

    public static void checkSingleDigit(int number) throws MultipleDigitsException {
        if (number < -9 || number > 9) {
            throw new MultipleDigitsException("Error: The number has more than one digit.");
        }
        System.out.println("The number is a single digit: " + number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        try {
            checkSingleDigit(number);
        }
        catch (MultipleDigitsException e) {
            System.out.println(e.getMessage());
        }
    }
}