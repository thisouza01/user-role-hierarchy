public class Salesman extends Manager{

    private int salesQuantity;

    public Salesman(String name,
                    String email,
                    String password,
                    int salesQuantity) {
            super(name, email, password);

            this.salesQuantity = salesQuantity;
            this.isAdmin = false;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

   public void makeSales() {
        this.salesQuantity += 1;
   }

   public void alterEmail(String email) {

   }

   public void alterPassword(String password) {

   }
}
