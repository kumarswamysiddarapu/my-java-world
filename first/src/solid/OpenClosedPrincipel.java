package solid;

public class OpenClosedPrincipel {
    public static void main(String[] args) {
        Payable p= new CreditCard();
        p.pay();
        Payable p1= new DebitCard();
        p1.pay();
        Payable p2= new PaymentProcessor();
        p2.pay();
        Payable p3= new PaymentProcessor();
        p3.pay();
    }
}
interface Payable{
    void pay();
}
class CreditCard implements Payable{
    @Override
    public void pay() {
      System.out.println("payment via CreditCard");
    }
}
class DebitCard implements Payable{
    @Override
    public void pay() {
        System.out.println("payment via DebitCard");
    }
}
class PaymentProcessor implements Payable{
    @Override
    public void pay() {
        System.out.println("payment via PaymentProcessor");
    }
}
class PayPal implements Payable{
    @Override
    public void pay() {
        System.out.println("payment via PayPal");
    }
}
