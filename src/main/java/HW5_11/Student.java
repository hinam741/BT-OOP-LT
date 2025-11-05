package HW5_11;

public class Student extends Person {
    public Student(String fullname, String email, String id) {
        super(fullname, email, id);
    }

    @Override
    public String toString() {
        return getFullname() + " (ID: " + getId() + ", Email: " + getEmail() + ")";
    }
}