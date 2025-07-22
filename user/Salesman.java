public class Salesman extends Manager{

    private int salesQuantity;

    public Salesman(String name,
                    String email,
                    String password) {
            super(name, email, password);

            this.salesQuantity = 0;
            this.isAdmin = false;
    }

   public void makeSales(int quantity) {
        this.salesQuantity += quantity;
   }

   public int consultSales(){
       return salesQuantity;
   }


}
