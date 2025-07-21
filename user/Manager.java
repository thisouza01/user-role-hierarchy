public class Manager {
    private String name;
    private String email;
    private String password;
    private boolean isAdmin;


    public Manager(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = true;
    }
}
