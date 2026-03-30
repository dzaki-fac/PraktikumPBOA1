public abstract class User {
    protected String email;
    protected String id;
    protected String name;
    protected String password;

    public User(String email, String id, String name, String password) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void logout() {
        System.out.println(name + " telah logged out.");
    }
}