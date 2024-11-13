// Base class
class Bank {
    // Protected to allow subclass access
    protected double baseTransactionCharge;

    // Constructor to set the default transaction charge
    public Bank() {
        this.baseTransactionCharge = 10.0; // Default base transaction charge
    }

    // Getter for the base transaction charge
    public double getBaseTransactionCharge() {
        return baseTransactionCharge;
    }
}

// Derived class: ICICI
class ICICI extends Bank {
    private double additionalChargePercentage;

    // Constructor to set the additional charge percentage
    public ICICI(double additionalChargePercentage) {
        super(); // Call the base class constructor
        this.additionalChargePercentage = additionalChargePercentage;
    }

    // Method to calculate the ICICI-specific transaction charge
    public double calculateTransactionCharge() {
        return baseTransactionCharge + (baseTransactionCharge * additionalChargePercentage / 100);
    }
}

// Derived class: HDFC
class HDFC extends Bank {
    private double fixedAdditionalCharge;

    // Constructor to set the fixed additional charge
    public HDFC(double fixedAdditionalCharge) {
        super(); // Call the base class constructor
        this.fixedAdditionalCharge = fixedAdditionalCharge;
    }

    // Method to calculate the HDFC-specific transaction charge
    public double calculateTransactionCharge() {
        return baseTransactionCharge + fixedAdditionalCharge;
    }
}

// Main class to test the functionality
public class BankChargesDemo {
    public static void main(String[] args) {
        // Create an ICICI object with an additional charge percentage of 15%
        ICICI iciciBank = new ICICI(15.0);
        System.out.println("ICICI Transaction Charge: ₹" + iciciBank.calculateTransactionCharge());

        // Create an HDFC object with a fixed additional charge of ₹5
        HDFC hdfcBank = new HDFC(5.0);
        System.out.println("HDFC Transaction Charge: ₹" + hdfcBank.calculateTransactionCharge());
    }
}