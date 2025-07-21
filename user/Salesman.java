public class Salesman extends Manager{

    private int salesQuantity;
    private boolean isAdmin;

    public Salesman(String name,
                    String email,
                    String password,
                    int salesQuantity) {
            super(name, email, password);

            this.salesQuantity = salesQuantity;
            this.isAdmin = false;
    }


}
