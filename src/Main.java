public class Main {

    public static void main(String[] args){

    //    Manager manager = new Manager("Thiago", "thiago@gmail.com", "123456789");
    //    System.out.println(manager.getName());
    //    Caxier caxier = new Caxier("ago", "ago@gmail.com", "123456789", 2000);
    //    System.out.println(caxier.getName());


        // Instancia a classe e adiciona 1 a contagem de vendas
        Salesman salesman = new Salesman("Gabi", "Gabi@gmail.com", "123456789");
        salesman.makeSales();
        salesman.makeSales();
        salesman.makeSales();

        // Altera email do vendedor
        System.out.println(salesman.getEmail());
        salesman.alterEmail("thiago01@gmail.com");

        // consulta
        System.out.println(salesman.consultSales());
        System.out.println(salesman.getEmail());



    }

}
