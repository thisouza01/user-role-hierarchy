public class Caxier extends Manager{

    private double cashValue;
    private boolean isAdmin;

    public Caxier(String name,
                  String email,
                  String password,
                  double cashValue) {
        super(name, email, password);

        this.cashValue = cashValue;
        this.isAdmin = false;
    }
}
