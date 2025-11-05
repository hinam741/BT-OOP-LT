package HW5_11;

public abstract class Person {
    private String fullname;
    private String email;
    private String id;

    public Person(String fullname, String email, String id) {
        this.fullname = fullname;
        this.email = email;
        this.id = id;
    }

    public String getFullname() { return fullname; }
    public String getEmail() { return email; }
    public String getId() { return id; }
}
