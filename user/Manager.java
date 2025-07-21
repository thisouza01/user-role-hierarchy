public class Manager {
    private String name;
    private String email;
    private String password;
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

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
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



}
