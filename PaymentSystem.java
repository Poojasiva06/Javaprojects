
// Design an Online Payment System with an abstract class PaymentMethod containing an abstract method processPayment(). 
// Create two derived classes: CreditCard and PayPal, each implementing the processPayment() method differently 
// (for example, one might charge a fee, and the other might not). Create a method processTransaction(PaymentMethod paymentMethod) 
// that accepts a PaymentMethod object and processes the payment by calling processPayment(). Demonstrate polymorphism by using 
// both CreditCard and PayPal objects in the transaction processing system.
import java.util.*;
abstract class PaymentMethod{
    abstract void processPayment(double amount);
}
class CreditCard extends PaymentMethod{
    double feePercentage;

    CreditCard(double feePercentage){
        this.feePercentage=feePercentage;
    }
    void processPayment(double amount)
    {
        double fee= amount+feePercentage/100;
        double totalAmount = amount+fee;
        System.out.println("Processing payment through credit card");
        System.out.println(amount);
        System.out.println(fee);
        System.out.println(totalAmount);
    }
}
class Paypal extends PaymentMethod
{
    void processPayment(double amount){
        System.out.println("Processing payment through Paypal");
        System.out.println(amount);
        System.out.println("No extra fee");
    }
}
public class PaymentSystem {
    public static void processTransaction(PaymentMethod paymentMethod, double amount)
    {
        paymentMethod.processPayment(amount);
    }
    public static void main(String[] args) {
        PaymentMethod creditcard = new CreditCard(2.5);
        PaymentMethod Paypal = new Paypal();
        System.out.println("Creditcard Transaction:");
        processTransaction(creditcard, 500.0);
        System.out.println("Paypal Transaction: ");
        processTransaction(Paypal, 500.0);

    }
}
