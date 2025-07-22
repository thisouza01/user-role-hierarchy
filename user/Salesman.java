public class Salesman extends Manager{

    private int salesQuantity;

    public Salesman(String name,
                    String email,
                    String password) {
            super(name, email, password);

            this.salesQuantity = 0;
            this.isAdmin = false;
    }

   public void makeSales() {
        this.salesQuantity += 1;
   }

   @Override
   public int consultSales(){
       return salesQuantity;
   }


}
