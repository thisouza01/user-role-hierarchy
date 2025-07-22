public class Main {

    public static void main(String[] args){

    //    Manager manager = new Manager("Thiago", "thiago@gmail.com", "123456789");
    //    System.out.println(manager.getName());
    //    Caxier caxier = new Caxier("ago", "ago@gmail.com", "123456789", 2000);
    //    System.out.println(caxier.getName());


        // Instancia a classe e adiciona 1 a contagem de vendas
        Salesman salesman = new Salesman("Gabi", "Gabi@gmail.com", "123456789");
        salesman.makeSales();
        Salesman salesman2 = new Salesman("Gabi", "Gabi@gmail.com", "123456789");
        System.out.println(salesman2.getName());
        salesman2.makeSales();

        // Altera email do vendedor
        salesman2.alterEmail("thiago01@gmail.com");

        // consulta
        System.out.println(salesman2.consultSales());
        System.out.println(salesman2.getEmail());
        System.out.println(salesman.getEmail());



    }

}
