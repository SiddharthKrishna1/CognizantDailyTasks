class Payment {
    void payAmount() {
        System.out.println("Processing generic payment...");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Paid using Credit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Paid using UPI.");
    }
}

class CashPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Paid using Cash.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.payAmount();  

        payment = new UPIPayment();
        payment.payAmount();  
        payment = new CashPayment();
        payment.payAmount();  
    }
}
