public class Cashier extends Manager{

    private double cashValue;

    public Cashier(String name,
                   String email,
                   String password) {
        super(name, email, password);

        this.cashValue = 0;
        this.isAdmin = false;
    }

    public double closeCashRegister() {
        return cashValue;
    }

    public void receivePayment(double payment){
        this.cashValue += payment;
    }
}
