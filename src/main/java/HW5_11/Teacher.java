package HW5_11;

interface Supervisor {
    String getFullname();
    String getEmail();
}

public class Teacher extends Person implements Supervisor {
    private String title;

    public Teacher(String fullname, String email, String id, String title) {
        super(fullname, email, id);
        this.title = title;
    }

    public String getTitle() { return title; }

    @Override
    public String toString() {
        return getFullname() + " (ID: " + getId() + ", Title: " + getTitle() + ", Email: " + getEmail() + ")";
    }
}