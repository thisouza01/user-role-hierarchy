public class Manager {
    protected String name;
    protected String email;
    protected String password;
    protected boolean isAdmin;


    public Manager(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = true;
    }

    // getters
    public String getName() {
        return name;
    }

    public String generateReport() {
        return "Relatorio gerado!";
    }

    public int consultSales() {
        return 0;
    }

    public String login(String email, String password){
        return "Login efetuado!";
    }

    public String logoff(){
        return "Deslogado!";
    }

    public void alterEmail(String email) {
        this.email = email;
    }

    public void alterPassword(String password) {
        this.password = password;
    }



}
