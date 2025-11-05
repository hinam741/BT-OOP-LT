package HW5_11;

public class Advisor implements Supervisor {
    private String fullname;
    private String email;

    public Advisor(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    @Override
    public String getFullname() { return fullname; }
    @Override
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return getFullname() + " (Email: " + getEmail() + ")";
    }
}
