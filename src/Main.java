public class Main {

    public static void main(String[] args){

    //    Manager manager = new Manager("Thiago", "thiago@gmail.com", "123456789");
    //    System.out.println(manager.getName());

    /*
        // Instancia a classe e adiciona 1 a contagem de vendas
        Salesman salesman = new Salesman("Gabi", "Gabi@gmail.com", "123456789");
        salesman.makeSales(3);
        salesman.makeSales(2);

        // Altera email do vendedor
        System.out.println(salesman.getEmail());
        salesman.alterEmail("thiago01@gmail.com");

        // consulta
        System.out.println(salesman.consultSales());
        System.out.println(salesman.getEmail());
    */

        Cashier cashier = new Cashier(
                "ago",
                "ago@gmail.com",
                "123456789");

        System.out.println(cashier.getName());

        cashier.receivePayment(500);
        System.out.println(cashier.closeCashRegister());
        cashier.receivePayment(500);
        System.out.println(cashier.closeCashRegister());

        System.out.println(cashier.login("gabi@.com", "123456"));

        System.out.println(cashier.logoff());

    }

}
