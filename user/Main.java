public class Main {

    public static void main(String[] args){

        Manager manager = new Manager("Thiago", "thiago@gmail.com", "123456789");
        Salesman salesman = new Salesman("Thi", "thi@gmail.com", "123456789", 200);
        Caxier caxier = new Caxier("ago", "ago@gmail.com", "123456789", 2000);

        System.out.println(manager.getName());

        System.out.println(salesman.getName());

        System.out.println(caxier.getName());
    }

}
