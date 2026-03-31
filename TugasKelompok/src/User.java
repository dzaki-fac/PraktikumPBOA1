// Disusun oleh:
// Daniel Lamganda Tua G.	(24060124120048)
// Dehar Zaidan Dzaki A.	(24060124130099)
// Dzaki Fathul’Alim Cahyo	(24060124130103)
// Elang Fadila Ahmad	    (24060124130108)

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
        assert email != null : "Email tidak boleh null";
        assert password != null : "Password tidak boleh null";

        if (email.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Email/password tidak boleh kosong");
        }

        return this.email.equals(email) && this.password.equals(password);
    }

    public void logout() {
        System.out.println(name + " telah logged out.");
    }
}