public class Caxier extends Manager{

    private double cashValue;

    public Caxier(String name,
                  String email,
                  String password,
                  double cashValue) {
        super(name, email, password);

        this.cashValue = cashValue;
        this.isAdmin = false;
    }
}
